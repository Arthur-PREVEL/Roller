<template>
  <div class="footer">
    <div class="social-media">
      <div class="iconoir-facebook">
        <img class="group" alt="Group" :src="group" />
      </div>
      <div class="iconoir-instagram">
        <img class="group" alt="Group" :src="image" />
      </div>
      <img class="bx-bxl-whatsapp" alt="Bx bxl whatsapp" :src="bxBxlWhatsapp" />
    </div>
    <img class="line" alt="Line" :src="line" />
    <div class="act-res-clu">
      <div class="list">À propos</div>
      <div class="text-wrapper">Résultats</div>
      <div class="div">Membres du bureau</div>
      <div class="overlap-group">
        <div class="list-2">Calendrier</div>
        <p class="p">
          <span class="span">Rejoindre</span>
          <span class="text-wrapper-2"> le club</span>
        </p>
        <div class="list-3">Compétitions</div>
        <div class="list-4">Évènements</div>
      </div>
      <div class="overlap">
        <div class="list-5">Règlement</div>
        <div class="list-6">Entraînement</div>
      </div>
      <div class="title">Activités</div>
      <div class="title-2">Ressources</div>
      <div class="title-3">Le Club</div>
    </div>
    <div class="copyright">
      <div class="copyright-2">
        PTUT_Groupe8©&nbsp;&nbsp;2025. All right reserved
      </div>
    </div>
    <img class="federation-logo" alt="Federation logo" :src="federationLogo" />
    <div class="patie-droite">
      <div class="overlap-2">
        <div class="phone">
          <div class="element">+ 33 07685925</div>
        </div>
        <img class="telephone" alt="Telephone" :src="telephone1" />
      </div>
      <div class="overlap-3">
        <div class="mail">
          <div class="agensi-mail-com">pvt@mail.com</div>
        </div>
        <img class="image" alt="Image" :src="image5" />
      </div>
      <p class="description">
        Vivez votre passion du roller avec nous ! Entraînements, compétitions et événements tout au long de l'année.
      </p>
    </div>
  </div>
</template>

<script>
import bxBxlWhatsapp from "@/components/icons/whatsapp.svg";
import federationLogo from "@/components/icons/federationlogo.svg";
import group from "@/components/icons/insta.svg";
import image5 from "@/components/icons/image5.svg";
import image from "@/components/icons/facebook.svg";
import line from "@/components/icons/Line.svg";
import telephone1 from "@/components/icons/telephone.png";

export default {
  name: "Footer",
  data() {
    return {
      bxBxlWhatsapp,
      federationLogo,
      group,
      image5,
      image,
      line,
      telephone1,
    };
  },
};
</script>

<style>
.footer {
  height: 552px;
  position: relative;
  width: 1920px;
}

.footer .social-media {
  height: 32px;
  left: 890px;
  position: absolute;
  top: 402px;
  width: 128px;
}

.footer .iconoir-facebook {
  height: 32px;
  left: 0;
  position: absolute;
  top: 0;
  width: 32px;
}

.footer .group {
  height: 24px;
  left: 4px;
  position: absolute;
  top: 4px;
  width: 24px;
}

.footer .iconoir-instagram {
  height: 32px;
  left: 96px;
  position: absolute;
  top: 0;
  width: 32px;
}

.footer .bx-bxl-whatsapp {
  height: 32px;
  left: 48px;
  position: absolute;
  top: 0;
  width: 32px;
}

.footer .line {
  height: 2px;
  left: 154px;
  position: absolute;
  top: 481px;
  width: 1643px;
}

.footer .act-res-clu {
  height: 173px;
  left: 742px;
  position: absolute;
  top: 166px;
  width: 842px;
}

.footer .list {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 561px;
  letter-spacing: 0;
  line-height: 18px;
  position: absolute;
  top: 55px;
  white-space: nowrap;
  width: 257px;
}

.footer .text-wrapper {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 561px;
  letter-spacing: 0;
  line-height: 18px;
  position: absolute;
  top: 96px;
  white-space: nowrap;
  width: 257px;
}

.footer .div {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 561px;
  letter-spacing: 0;
  line-height: 18px;
  position: absolute;
  top: 140px;
  white-space: nowrap;
  width: 137px;
}

.footer .overlap-group {
  height: 85px;
  left: 0;
  position: absolute;
  top: 88px;
  width: 513px;
}

.footer .list-2 {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 256px;
  letter-spacing: 0.30px;
  line-height: 40px;
  position: absolute;
  top: 0;
  white-space: nowrap;
  width: 257px;
}

.footer .p {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 256px;
  letter-spacing: 0;
  line-height: 18px;
  position: absolute;
  top: 55px;
  white-space: nowrap;
  width: 257px;
}

.footer .span {
  color: #000000d9;
  font-family: var(--text-font-family);
  font-size: var(--text-font-size);
  font-style: var(--text-font-style);
  font-weight: var(--text-font-weight);
  letter-spacing: var(--text-letter-spacing);
  line-height: var(--text-line-height);
}

.footer .text-wrapper-2 {
  font-family: var(--body-10-font-family);
  font-size: var(--body-10-font-size);
  font-style: var(--body-10-font-style);
  font-weight: var(--body-10-font-weight);
  letter-spacing: var(--body-10-letter-spacing);
  line-height: var(--body-10-line-height);
}

.footer .list-3 {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 1px;
  letter-spacing: 0.30px;
  line-height: 40px;
  position: absolute;
  top: 0;
  width: 255px;
}

.footer .list-4 {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 0;
  letter-spacing: 0.30px;
  line-height: 40px;
  position: absolute;
  top: 39px;
  white-space: nowrap;
  width: 258px;
}

.footer .overlap {
  height: 47px;
  left: 0;
  position: absolute;
  top: 41px;
  width: 513px;
}

.footer .list-5 {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 256px;
  letter-spacing: 0.30px;
  line-height: 40px;
  position: absolute;
  top: 6px;
  white-space: nowrap;
  width: 257px;
}

.footer .list-6 {
  color: #000000d9;
  font-family: "Jost-Regular", Helvetica;
  font-size: 16px;
  font-weight: 400;
  left: 0;
  letter-spacing: 0.30px;
  line-height: 40px;
  position: absolute;
  top: 0;
  white-space: nowrap;
  width: 257px;
}

.footer .title {
  color: #083a3e;
  font-family: var(--titre-5-font-family);
  font-size: var(--titre-5-font-size);
  font-style: var(--titre-5-font-style);
  font-weight: var(--titre-5-font-weight);
  left: 1px;
  letter-spacing: var(--titre-5-letter-spacing);
  line-height: var(--titre-5-line-height);
  position: absolute;
  top: 2px;
  white-space: nowrap;
  width: 110px;
}

.footer .title-2 {
  color: #083a3e;
  font-family: var(--titre-5-font-family);
  font-size: var(--titre-5-font-size);
  font-style: var(--titre-5-font-style);
  font-weight: var(--titre-5-font-weight);
  left: 253px;
  letter-spacing: var(--titre-5-letter-spacing);
  line-height: var(--titre-5-line-height);
  position: absolute;
  top: 0;
  white-space: nowrap;
  width: 110px;
}

.footer .title-3 {
  color: #083a3e;
  font-family: var(--titre-5-font-family);
  font-size: var(--titre-5-font-size);
  font-style: var(--titre-5-font-style);
  font-weight: var(--titre-5-font-weight);
  left: 560px;
  letter-spacing: var(--titre-5-letter-spacing);
  line-height: var(--titre-5-line-height);
  position: absolute;
  top: 0;
  white-space: nowrap;
  width: 110px;
}

.footer .copyright {
  height: 24px;
  left: 752px;
  position: absolute;
  top: 528px;
  width: 424px;
}

.footer .copyright-2 {
  color: #92989e;
  font-family: "Jost-Regular", Helvetica;
  font-size: 12px;
  font-weight: 400;
  left: 0;
  letter-spacing: 0.26px;
  line-height: 16px;
  position: absolute;
  text-align: center;
  top: 0;
  width: 422px;
}

.footer .federation-logo {
  height: 162px;
  left: 1644px;
  object-fit: cover;
  position: absolute;
  top: 177px;
  width: 162px;
}

.footer .patie-droite {
  height: 235px;
  left: 144px;
  overflow: hidden;
  position: absolute;
  top: 113px;
  width: 395px;
}

.footer .overlap-2 {
  height: 31px;
  left: 0;
  position: absolute;
  top: 204px;
  width: 208px;
}

.footer .phone {
  height: 26px;
  left: 0;
  position: absolute;
  top: 5px;
  width: 208px;
}

.footer .element {
  color: #000000d9;
  font-family: var(--body-10-font-family);
  font-size: var(--body-10-font-size);
  font-style: var(--body-10-font-style);
  font-weight: var(--body-10-font-weight);
  left: 52px;
  letter-spacing: var(--body-10-letter-spacing);
  line-height: var(--body-10-line-height);
  position: absolute;
  top: -1px;
  width: 156px;
}

.footer .telephone {
  height: 27px;
  left: 6px;
  object-fit: cover;
  position: absolute;
  top: 0;
  width: 27px;
}

.footer .overlap-3 {
  height: 37px;
  left: 0;
  position: absolute;
  top: 155px;
  width: 217px;
}

.footer .mail {
  height: 26px;
  left: 0;
  overflow: hidden;
  position: absolute;
  top: 5px;
  width: 217px;
}

.footer .agensi-mail-com {
  color: #000000d9;
  font-family: var(--body-10-font-family);
  font-size: var(--body-10-font-size);
  font-style: var(--body-10-font-style);
  font-weight: var(--body-10-font-weight);
  left: 53px;
  letter-spacing: var(--body-10-letter-spacing);
  line-height: var(--body-10-line-height);
  position: absolute;
  top: -1px;
  width: 164px;
}

.footer .image {
  height: 37px;
  left: 1px;
  object-fit: cover;
  position: absolute;
  top: 0;
  width: 37px;
}

.footer .description {
  color: #000000d9;
  font-family: var(--body-10-font-family);
  font-size: var(--body-10-font-size);
  font-style: var(--body-10-font-style);
  font-weight: var(--body-10-font-weight);
  left: 0;
  letter-spacing: var(--body-10-letter-spacing);
  line-height: var(--body-10-line-height);
  position: absolute;
  text-align: justify;
  top: 79px;
  width: 397px;
}
</style>