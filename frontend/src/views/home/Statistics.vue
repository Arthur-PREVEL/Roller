<template>
    <div class="box">
      <div class="expertises">
        <div class="types-entr">
          <div class="text-wrapper">Types d’entraînement</div>
          <div class="div">4+</div>
        </div>
        <div class="comptitions">
          <div class="text-wrapper-2">Compétitions</div>
          <div class="text-wrapper-3">10+</div>
        </div>
        <div class="membres">
          <div class="text-wrapper-4">Membres</div>
          <div class="text-wrapper-5">40+</div>
        </div>
      </div>
    </div>
  </template>
  
  <script>
  export default {
    name: "Box",
  };
  </script>
  
  <style scoped>
  .box {
    height: 85px;
    position: relative;
    width: 796px;
  }
  
  .box .expertises {
    height: 85px;
    left: 0;
    position: fixed;
    top: 0;
    width: 796px;
  }
  
  .box .types-entr {
    height: 85px;
    left: 613px;
    position: absolute;
    top: 0;
    width: 187px;
  }
  
  .box .text-wrapper {
    color: #3f3f3f;
    font-family: "Inter-Regular", Helvetica;
    font-size: 18px;
    font-weight: 400;
    left: 0;
    letter-spacing: 0;
    line-height: 18px;
    opacity: 0.6;
    position: absolute;
    top: 68px;
    white-space: nowrap;
    width: 183px;
  }
  
  .box .div {
    color: #083a3e;
    font-family: "Poppins-SemiBold", Helvetica;
    font-size: 48px;
    font-weight: 600;
    left: 3px;
    letter-spacing: 0;
    line-height: 64px;
    position: absolute;
    top: 0;
    white-space: nowrap;
    width: 65px;
  }
  
  .box .comptitions {
    height: 85px;
    left: 289px;
    position: absolute;
    top: 0;
    width: 118px;
  }
  
  .box .text-wrapper-2 {
    color: #3f3f3f;
    font-family: "Inter-Regular", Helvetica;
    font-size: 18px;
    font-weight: 400;
    left: 0;
    letter-spacing: 0;
    line-height: 18px;
    opacity: 0.6;
    position: absolute;
    top: 68px;
    white-space: nowrap;
    width: 114px;
  }
  
  .box .text-wrapper-3 {
    color: #083a3e;
    font-family: "Poppins-SemiBold", Helvetica;
    font-size: 48px;
    font-weight: 600;
    left: 22px;
    letter-spacing: 0;
    line-height: 64px;
    position: absolute;
    top: 0;
    white-space: nowrap;
    width: 81px;
  }
  
  .box .membres {
    height: 85px;
    left: 0;
    position: absolute;
    top: 0;
    width: 100px;
  }
  
  .box .text-wrapper-4 {
    color: #3f3f3f;
    font-family: "Inter-Regular", Helvetica;
    font-size: 18px;
    font-weight: 400;
    left: 7px;
    letter-spacing: 0;
    line-height: 18px;
    opacity: 0.6;
    position: absolute;
    top: 68px;
    white-space: nowrap;
    width: 80px;
  }
  
  .box .text-wrapper-5 {
    color: #083a3e;
    font-family: "Poppins-SemiBold", Helvetica;
    font-size: 48px;
    font-weight: 600;
    left: 0;
    letter-spacing: 0;
    line-height: 64px;
    position: absolute;
    top: 0;
    white-space: nowrap;
    width: 96px;
  }
  </style>