// JavaScript for Community Event Portal

// Log a welcome message
console.log("Welcome to the Community Portal");

// Alert on page load
window.onload = () => {
  alert("Page fully loaded");
  loadEvents();
  renderRegistrations();
};

// Mock event data with online images
const events = [
  {
    id: 1,
    name: "Music Festival",
    date: "2025-07-20",
    seats: 5,
    category: "Music",
    image: "https://www.empowordjournalism.com/wp-content/uploads/2023/04/pexels-wendy-wei-1190297-e1684760486385-640x425.jpg"
  },
  {
    id: 2,
    name: "Baking Workshop",
    date: "2025-07-10",
    seats: 3,
    category: "Workshop",
    image: "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSn2F9xzZFWZcQUSfdOy7La_IVaQaHqnp9Bvg&s"
  },
  {
    id: 3,
    name: "Local Football Match",
    date: "2025-06-15",
    seats: 8,
    category: "Sports",
    image: "https://blog.playo.co/wp-content/uploads/2021/06/Barc%CC%A7a-Football-Club-Camp-Nou-Experience-Tour-Tickets-in-Barcelona.jpeg"
  },
];

// Store registrations
const registrations = [];

// Load and display events
function loadEvents() {
  const container = document.getElementById("eventContainer");
  container.innerHTML = "";

  const today = new Date();

  events.forEach(event => {
    const eventDate = new Date(event.date);
    if (eventDate > today && event.seats > 0) {
      const col = document.createElement("div");
      col.className = "col-sm-6 col-md-4 mb-4";
      col.innerHTML = `
        <div class="event-card p-3">
          <img src="${event.image}" alt="${event.name}" class="img-fluid mb-2 rounded" style="width: 100%; height: 200px; object-fit: cover;">
          <h5>${event.name}</h5>
          <p>Date: ${event.date}</p>
          <p>Available Seats: ${event.seats}</p>
          <button class="btn btn-primary" onclick="registerUser(${event.id})">Register</button>
        </div>
      `;
      container.appendChild(col);
    }
  });
}

// Register user for event
function registerUser(eventId) {
  const event = events.find(e => e.id === eventId);
  if (event && event.seats > 0) {
    event.seats--;
    alert(`Registered for ${event.name}`);
    loadEvents();
  } else {
    alert("Registration failed: Event is full or invalid");
  }
}

// Handle form submission
const form = document.getElementById("registrationForm");
form.addEventListener("submit", async (e) => {
  e.preventDefault();

  const name = form.name.value;
  const email = form.email.value;
  const date = form.eventDate.value;
  const type = form.eventType.value;
  const message = form.message.value;

  try {
    const response = await fakePost({ name, email, date, type, message });
    document.getElementById("formOutput").textContent = response;
    registrations.push({ name, email, date, type });
    renderRegistrations();
    form.reset();
  } catch (err) {
    console.error("Registration error:", err);
  }
});

// Fake fetch API call
function fakePost(data) {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("Data submitted:", data);
      resolve("Thank you for registering!");
    }, 1000);
  });
}

// Render registered users in a table
function renderRegistrations() {
  const tableContainer = document.getElementById("registrationTableBody");
  if (!tableContainer) return;
  tableContainer.innerHTML = registrations.map((reg, index) => `
    <tr>
      <td>${index + 1}</td>
      <td>${reg.name}</td>
      <td>${reg.email}</td>
      <td>${reg.date}</td>
      <td>${reg.type}</td>
    </tr>
  `).join("");
}

// Save event preference to localStorage
const eventTypeSelect = document.getElementById("eventType");
eventTypeSelect.addEventListener("change", () => {
  localStorage.setItem("preferredEventType", eventTypeSelect.value);
});

document.addEventListener("DOMContentLoaded", () => {
  const preferred = localStorage.getItem("preferredEventType");
  if (preferred) {
    eventTypeSelect.value = preferred;
  }

  // Geolocation
  const geoButton = document.getElementById("geoButton");
  const geoOutput = document.getElementById("geoOutput");
  if (geoButton && geoOutput) {
    geoButton.addEventListener("click", () => {
      if (!navigator.geolocation) {
        geoOutput.textContent = "Geolocation is not supported by your browser.";
        return;
      }

      geoOutput.textContent = "Locating...";

      navigator.geolocation.getCurrentPosition(
        position => {
          const { latitude, longitude } = position.coords;
          geoOutput.textContent = `Latitude: ${latitude.toFixed(2)}, Longitude: ${longitude.toFixed(2)}`;
        },
        error => {
          geoOutput.textContent = `Error: ${error.message}`;
        },
        {
          enableHighAccuracy: true,
          timeout: 10000,
          maximumAge: 0
        }
      );
    });
  }

  // Video ready event
  const eventVideo = document.getElementById("eventVideo");
  const videoMsg = document.getElementById("videoMessage");
  if (eventVideo && videoMsg) {
    eventVideo.addEventListener("canplay", () => {
      videoMsg.textContent = "Video ready to play";
    });
  }
});
