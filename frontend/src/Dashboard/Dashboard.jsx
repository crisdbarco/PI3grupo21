import React, { useEffect, useState } from "react";
import { useAuthState } from "react-firebase-hooks/auth";
import { useNavigate } from "react-router-dom";
import "./Dashboard.css";
import { auth, db, logout } from "../firebase";
import { query, collection, getDocs, where } from "firebase/firestore";

function Dashboard() {
  const [user, loading] = useAuthState(auth);
  const [name, setName] = useState("");
  const navigate = useNavigate();

  // eslint-disable-next-line react-hooks/exhaustive-deps
  const fetchUserName = async () => {
    try {
      const q = query(collection(db, "users"), where("uid", "==", user?.uid));
      const doc = await getDocs(q);
      const data = doc.docs[0].data();

      setName(data.name);
    } catch (err) {
      console.error(err);
      alert("An error occurred while fetching user data");
    }
  };

  useEffect(() => {
    if (loading) return;
    if (!user) return navigate("/");

    fetchUserName();
  }, [user, loading, navigate, fetchUserName]);

  return (
    <div className="dashboard">
      <div className="dashboard__container">
        <div className="text-message">
          <p className="text-message">Obrigado pela sua doação de sangue, {name}!</p>
          <div>{user?.email}</div>
        </div>
        <img
          src="https://www.florence.edu.br/wp-content/uploads/2023/06/WhatsApp-Image-2023-06-13-at-14.27.20-600x400.jpeg"
          alt="Imagem de gratidão"
          className="gratitude-image"
        />
       
        <button className="dashboard__btn" onClick={logout}>
          Sair
        </button>
      </div>
    </div>
  );
}

export default Dashboard;