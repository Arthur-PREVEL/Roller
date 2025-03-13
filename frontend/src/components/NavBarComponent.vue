<template>
    <div class="menu">
      <div class="sign-in">
        <div class="div-wrapper">
          <div class="text-wrapper">Se connecter</div>
        </div>
      </div>
  
      <div class="nav-bar">
        <div class="frame">
          <div class="div">
            <div class="text-wrapper-2">Accueil</div>
          </div>
  
          <div class="frame-2">
            <div class="text-wrapper-3">Actualités</div>
          </div>
  
          <div class="text-wrapper-3">Compétitions</div>
  
          <div class="text-wrapper-3">Résultats</div>
  
          <div class="text-wrapper-3">Calendrier</div>
  
          <div class="text-wrapper-3">A propos de nous</div>
        </div>
      </div>
  
      <img class="shape" alt="Shape" src="@\components\icons\Shape.svg" />
  
      <img class="logo-PVT-r" alt="Logo PVT r" src="@\components\icons\LogoPVT.svg" />
    </div>
  </template>
  
  <script>
  export default {
    name: "Menu",
  };
  </script>
  
  <style>
  .menu {
    height: 88px;
    position: relative;
    width: 1438px;
  }
  
  .menu .sign-in {
    height: 45px;
    left: 1180px;
    position: absolute;
    top: 26px;
    width: 139px;
  }
  
  .menu .div-wrapper {
    align-items: flex-start;
    background-color: #973240;
    border-radius: 25.5px;
    display: inline-flex;
    gap: 7.5px;
    padding: 12px 24px;
    position: relative;
  }
  
  .menu .text-wrapper {
    color: #ffffff;
    font-family: "Poppins-Bold", Helvetica;
    font-size: 13.5px;
    font-weight: 700;
    letter-spacing: 0;
    line-height: 21px;
    margin-top: -0.75px;
    position: relative;
    white-space: nowrap;
    width: fit-content;
  }
  
  .menu .nav-bar {
    height: 18px;
    left: 426px;
    position: absolute;
    top: 38px;
    width: 658px;
  }
  
  .menu .frame {
    align-items: flex-start;
    display: flex;
    justify-content: space-between;
    position: relative;
    width: 658px;
  }
  
  .menu .div {
    align-items: flex-start;
    display: flex;
    flex-direction: column;
    position: relative;
    width: 51.75px;
  }
  
  .menu .text-wrapper-2 {
    align-self: stretch;
    color: #083a3e;
    font-family: "Poppins-Bold", Helvetica;
    font-size: 13.5px;
    font-weight: 700;
    letter-spacing: 0;
    line-height: 18px;
    margin-top: -0.75px;
    position: relative;
  }
  
  .menu .frame-2 {
    align-items: center;
    display: inline-flex;
    flex: 0 0 auto;
    gap: 7.5px;
    justify-content: center;
    position: relative;
  }
  
  .menu .text-wrapper-3 {
    color: #083a3e;
    font-family: "Poppins-Bold", Helvetica;
    font-size: 13.5px;
    font-weight: 700;
    letter-spacing: 0;
    line-height: 18px;
    margin-top: -0.75px;
    position: relative;
    white-space: nowrap;
    width: fit-content;
  }
  
  .menu .shape {
    height: 11px;
    left: 621px;
    position: absolute;
    top: 56px;
    width: 32px;
  }
  
  .menu .logo-PVT-r {
    height: 80px;
    left: 131px;
    position: absolute;
    top: 8px;
    width: 193px;
  }
  </style>