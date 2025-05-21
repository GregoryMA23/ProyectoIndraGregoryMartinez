document.addEventListener("DOMContentLoaded", () => {
  const slides = document.querySelector(".slides");
  const images = document.querySelectorAll(".slide");
  const prevBtn = document.querySelector(".prev");
  const nextBtn = document.querySelector(".next");

  let index = 0;
  let interval;

  function showSlide(i) {
    index = (i + images.length) % images.length;
    slides.style.transform = `translateX(-${index * 100}%)`;
  }

  function startAutoplay() {
    interval = setInterval(() => {
      showSlide(index + 1);
    }, 6000);
  }

  function stopAutoplay() {
    clearInterval(interval);
  }

  // Iniciar autoplay al cargar
  startAutoplay();

  // Permitir control manual con botones
  prevBtn.addEventListener("click", () => {
    showSlide(index - 1);
    stopAutoplay();
    startAutoplay();
  });

  nextBtn.addEventListener("click", () => {
    showSlide(index + 1);
    stopAutoplay();
    startAutoplay();
  });
});
