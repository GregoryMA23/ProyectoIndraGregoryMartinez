document.addEventListener("DOMContentLoaded", () => {
  const links = document.querySelectorAll(".menu a");
  const current = window.location.pathname.split("/").pop();

  links.forEach((link) => {
    if (link.getAttribute("href").includes(current)) {
      link.classList.add("activo");
    }
    link.addEventListener("click", function () {
      links.forEach((l) => l.classList.remove("activo"));
      this.classList.add("activo");
    });
  });
});
