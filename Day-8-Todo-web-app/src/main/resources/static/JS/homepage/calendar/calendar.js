document.addEventListener("DOMContentLoaded", () => {
  const calendar = {
    date: new Date(),
    selectedDate: new Date(),
    events: [
      { date: "2024-11-10", task: "Math Assignment Due" },
      { date: "2024-11-14", task: "Project Meeting" },
      { date: "2024-11-20", task: "Doctor Appointment" },
    ],
  };

  const monthYearElement = document.getElementById("month-year");
  const daysContainer = document.getElementById("days");
  const prevMonthButton = document.getElementById("prev-month");
  const nextMonthButton = document.getElementById("next-month");

  // Update the month-year heading
  function updateHeader() {
    const options = { month: "long", year: "numeric" };
    monthYearElement.textContent = calendar.date.toLocaleDateString(
      "en-US",
      options
    );
  }

  // Generate days for the calendar
  function generateDays() {
    daysContainer.innerHTML = ""; // clear any existing days
    const firstDay = new Date(
      calendar.date.getFullYear(),
      calendar.date.getMonth(),
      1
    );
    const lastDay = new Date(
      calendar.date.getFullYear(),
      calendar.date.getMonth() + 1,
      0
    );
    const startDay = firstDay.getDay(); // Get the day of the week for the 1st

    // Fill in previous month's trailing empty days
    for (let i = 0; i < startDay; i++) {
      const emptyCell = document.createElement("div");
      emptyCell.classList.add("day");
      daysContainer.appendChild(emptyCell);
    }

    // Generate day cells
    for (let i = 1; i <= lastDay.getDate(); i++) {
      const dayCell = document.createElement("div");
      dayCell.classList.add("day");
      dayCell.textContent = i;

      // format date string for comparison with event dates
      const dateStr = `${calendar.date.getFullYear()}-${String(
        calendar.date.getMonth() + 1
      ).padStart(2, "0")}-${String(i).padStart(2, "0")}`;

      // Check if the date has an event
      const event = calendar.events.find((e) => e.date === dateStr);
      if (event) {
        dayCell.classList.add("has-event");
        dayCell.setAttribute("title", event.task); // Tooltip with the given task
      }

      // Check if its the selected date
      if (
        i === calendar.selectedDate.getDate() &&
        calendar.date.getMonth() === calendar.selectedDate.getMonth() &&
        calendar.date.getFullYear() === calendar.selectedDate.getFullYear()
      ) {
        dayCell.classList.add("selected");
      }

      dayCell.addEventListener("click", () => {
        selectDate(i);
      });

      daysContainer.appendChild(dayCell);
    }
  }

  // Select a specific date
  function selectDate(day) {
    calendar.selectedDate = new Date(
      calendar.date.getFullYear(),
      calendar.date.getMonth(),
      day
    );
    generateDays();
  }

  function prevMonth() {
    calendar.date.setMonth(calendar.date.getMonth() - 1);
    updateHeader();
    generateDays();
  }

  function nextMonth() {
    calendar.date.setMonth(calendar.date.getMonth() + 1);
    updateHeader();
    generateDays();
  }

  // Initialize calendar
  updateHeader();
  generateDays();

  // Event listeners for navigation buttons
  prevMonthButton.addEventListener("click", prevMonth);
  nextMonthButton.addEventListener("click", nextMonth);
});
