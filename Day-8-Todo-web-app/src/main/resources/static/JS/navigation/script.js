const navigation = document.getElementById("js-auto-generate-nav");

const currenUrlPath = window.location.pathname;

const navigationLinks = [
  {
    name: "home",
    href: "/home",
  },
  {
    name: "All Tasks",
    href: "/tasks",
  },
  {
    name: "about",
    href: "/about",
  },
];

const linksHtml = navigationLinks
  .map((item) => `<li><a href="${item.href}">${item.name}</a></li>`)
  .join("");

const navigationHtml = `
        <ul id="links">
          ${linksHtml}
        </ul>
      `;

navigation.innerHTML += navigationHtml;

const anchorLinks = document.querySelectorAll("#links li a");

anchorLinks.forEach((link) => {
  const linkAttribute = link.getAttribute("href");

  if (linkAttribute.includes(currenUrlPath)) {
    link.classList.add("active");
  }
});
