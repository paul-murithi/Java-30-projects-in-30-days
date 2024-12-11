// Get all edit buttons
const editButtons = document.querySelectorAll(".task-card-edit");

editButtons.forEach((button) => {
  button.addEventListener("click", () => {
    // Get the parent task card element
    const taskCard = button.closest(".task-card");

    // Get the text content of the tasks
    const taskTitle = taskCard.querySelector(".task-card-title b").textContent;
    const taskDetail = taskCard.querySelector(".task-card-detail").textContent;

    const taskDate = taskCard.querySelector(".task-date").textContent;

    const taskPriority = taskCard.querySelector(".task-priority").textContent;

    // Open the edit task modal
    openEditTaskModal(taskTitle, taskDetail, taskDate, taskPriority);
  });
});

// Function to open the edit task modal
function openEditTaskModal(taskTitle, taskDetail, taskDate, taskPriority) {
  const modal = document.getElementById("editTaskModal");

  // Set the task title, detail, date, priority in the modal as per how the task was
  const titleInput = modal.querySelector("#title");
  const detailInput = modal.querySelector("#detail");
  const dateInput = modal.querySelector("#date");
  const priorityInput = modal.querySelector("#priority");

  titleInput.value = taskTitle;
  detailInput.value = taskDetail;
  dateInput.value = convertDateToMatchInput(taskDate);
  priorityInput.value = taskPriority;

  // Show the modal to enable editings
  modal.style.display = "block";
}

const closeModal = document.getElementById("close-modal");
closeModal.addEventListener("click", closeEditTaskModal);

// Handle modal cancel button
const cancelBtn = document.getElementById("cancel-btn");
cancelBtn.addEventListener("click", closeEditTaskModal);

// Function to close the edit task modal
function closeEditTaskModal() {
  const modal = document.getElementById("editTaskModal");
  modal.style.display = "none";
}

function convertDateToMatchInput(date) {
  // Convert to YYYY-MM-DD Format
  const [day, month, year] = date.split("/");
  console.log("Date before change: " + date);
  console.log(`Date after change: ${year}-${month}-${day}`);

  return `${year}-${month}-${day}`;
}
