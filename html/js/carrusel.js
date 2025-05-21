const slides = document.querySelectorAll(".slide");
const prevButton = document.getElementById("prev");
const nextButton = document.getElementById("next");
let index = 0;

function showSlide() {
  const container = document.querySelector(".carousel-container");
  container.style.transform = `translateX(-${index * 100}%)`;
}

nextButton.addEventListener("click", () => {
  index = (index + 1) % slides.length;
  showSlide();
});

prevButton.addEventListener("click", () => {
  index = (index - 1 + slides.length) % slides.length;
  showSlide();
});

showSlide();
