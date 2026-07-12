# 🏋️ Gym Workout Planner (Java Console App)

A one-time-generator console application that builds a **personalized weekly workout split**, calculates **maintenance calories (TDEE)**, and breaks down **protein/fat/carb targets** — all based on a user's body stats, body fat %, and fitness goal.

Built entirely with core Java: constructors, custom classes, arrays, loops, and conditional logic — no frameworks, no external libraries.

---

## 📌 Why this project is different

Most beginner "calculator" projects stop at printing a single number. This one goes further:

- It doesn't just calculate a goal — it **asks the user to choose** between valid options (bulk / cut / recomposition) based on where their body fat % falls, instead of silently deciding for them.
- The workout plan isn't hardcoded text — it's **built live** from 6 custom classes (`work1`–`work4`), where the user picks their own exercises from a recommended list for each muscle group.
- Beginners and experienced lifters get **different set/rep schemes automatically** — the same underlying workout structure adapts based on one input.
- Every number shown (BMI, body fat %, calories) comes with an **honest disclaimer** that it's an approximation, not medical advice — because it is, and pretending otherwise would be misleading.

---

## ⚙️ How It Works (Step by Step)

1. **Enter your details** — name, age, height (cm), weight (kg)
2. **Choose beginner or experienced** — changes workout intensity (sets/reps) later
3. **Choose your daily activity level** — very low / low / medium / high
4. **View your BMI** — calculated automatically
5. **Enter your body fat %** — (self-reported, since accurate measurement needs a scale/calipers — this program can't measure it for you)
6. **Get a goal recommendation** — based on your body fat %, pick from a numbered menu (e.g., Bulk / Cut / Body Recomposition)
7. **(Optional) Generate a 6-day workout split** — choose your own exercises from a curated list for each day
8. **Get your daily calorie target** — adjusted for your goal (cut = −400 cal, bulk = +400 cal, recomposition = maintenance)
9. **Get your protein/fat/carb breakdown** — calculated from your body weight and remaining calories
10. **Get a daily step goal** — based on your activity level

---

## ▶️ How to Run This Project

**Requirements:** Java JDK installed (any recent version), Eclipse or any Java IDE (or just `javac`/`java` from terminal)

**Using Eclipse:**
1. Clone/download this repo
2. Import as an existing Java project, or copy the `gymplanner` package into your `src` folder
3. Right-click `gymplanner.java` → Run As → Java Application
4. Follow the on-screen prompts

**Using terminal:**
```bash
javac gymplanner.java
java gymplanner
```

**Important:** Follow the on-screen instructions exactly (spelling, exact word choice like `yes`/`no`, numeric menu choices) — this program does basic input validation, but not fuzzy matching, so exact input matters.

---

## ✅ Features / Advantages

- **Personalized, not generic** — every output (workout, calories, macros) is generated from the user's own numbers, not a static template
- **Goal-aware calorie adjustment** — automatically shifts calories up/down based on the chosen goal, not a one-size-fits-all number
- **Beginner-friendly workout scaling** — automatically adjusts sets/reps intensity without the user needing to know training theory
- **Input validation loops** — beginner status and activity level are re-asked until valid input is given, instead of crashing or silently accepting garbage
- **Recommended exercises are marked clearly** — `(recommand)` tags guide less experienced users toward safer, higher-yield movements
- **Transparent about its own limits** — the program tells the user upfront that its numbers are estimates, not medical fact

---

## ⚠️ Known Errors / Limitations (Honest Disclosure)

This is a learning project, and being upfront about its limitations is part of building it responsibly:

| Limitation | Impact |
|---|---|
| No crash-protection on numeric input | Typing letters where a number is expected (age, height, weight, menu choice) will crash the program with an exception, not a friendly error message |
| Body fat % must be entered manually | The program cannot measure body composition — accuracy depends entirely on the user's external source (scale, calipers, visual chart) |
| Some duplication in workout-printing logic | The beginner vs. experienced print blocks repeat similar code with different numbers — a planned refactor target, not a functional bug |
| `work1`–`work4` classes each create their own `Scanner` | Currently harmless since they only use `nextLine()`, but this pattern could cause input bugs if numeric input is ever added to those classes later |
| One-time generator, no data persistence | Closing the program discards all entered data — nothing is saved between runs (by design, stated clearly to the user in-app) |
| Formulas are population averages | BMI, body fat % estimation, and TDEE (Mifflin-St Jeor) formulas are general estimates and may not reflect true individual metabolism or body composition, especially for users under 18 or with atypical body compositions |

---

## 🧠 Concepts Practiced

- Constructors (including constructor parameters doing real interactive work, not just field assignment)
- Multiple custom classes representing real-world entities (`detail`, `work1`–`work4`)
- Arrays for storing dynamic user input
- `Scanner` input handling, including the `nextInt()`/`nextLine()` buffer conflict and its fix
- Conditional branching for multi-tier decision logic (goal classification)
- Method chaining (BMI → body fat range → goal → calories → macros)
- Input validation loops

---

## 🗺️ Roadmap Context

This is Project 2 of a structured **2026–2030 AI Security Engineer roadmap**, built during Year 1 while learning Java OOP fundamentals (constructors, `this`, method design) ahead of formally studying inheritance and encapsulation.

---

## 👤 Author

**Jeeva** — [github.com/jeeva1978](https://github.com/jeeva1978)
