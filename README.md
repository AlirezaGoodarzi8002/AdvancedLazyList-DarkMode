# Advanced Lazy List with Dark Mode  

This project demonstrates an **advanced lazy list** in Jetpack Compose, designed for high performance, clean architecture, and modern UI practices. The app features optimized state handling, dynamic content interactions, and dark mode support, ensuring a smooth and visually appealing user experience.

---

## Features  

- **Dynamic Product List**  
  Products are displayed in a dynamic, scrollable list with properties such as name, description, cost, image, priority, and selection state.  

- **Dark Mode Support**  
  Full compatibility with light and dark themes using Material3's color schemes for an aesthetically pleasing UI.  

- **Scroll-to-Top Button**  
  A floating button that appears when the user scrolls down, implemented with smooth animations for visibility transitions.  ### State Hoisting  

This project implements **state hoisting** to improve reusability, testability, and separation of concerns.  
- **Why State Hoisting?**  
  - Keeps composables **stateless**, making them easier to test and reuse across different parts of the app.  
  - Moves the state and business logic out of the UI layer, ensuring a clean architecture.  
  - Simplifies managing shared state between parent and child composables by centralizing state updates in a single location.  

By hoisting state, the app achieves a more modular and maintainable codebase, adhering to Compose best practices.

---

## Performance Optimizations  

1. **Item Visibility Calculation with `derivedStateOf`**  
   - Used `derivedStateOf` to dynamically track item visibility and trigger animations like showing or hiding the scroll-to-top button.  
   - Avoids expensive recompositions by recalculating visibility states only when necessary.

2. **Efficient Lazy List Handling with `key`**  
   - Each item in the `LazyColumn` is uniquely identified using a `key`. This improves performance by preventing unnecessary re-renders and preserving scroll position across updates.

3. **Optimized State Management**  
   - Avoided complex calculations like `sortedBy` directly in composables to reduce recomposition overhead. Sorting and other data transformations are handled outside of the UI layer.  

4. **No Non-UI Logic in Composables**  
   - Ensured all business logic resides outside composables for a cleaner architecture and better separation of concerns.

5. **Efficient Usage of `remember`**  
   - Used `remember` to cache values and avoid repeated recalculations, enhancing UI responsiveness.

---

## Screenshots  

---  

| Light Mode                                | Dark Mode                                |
|-------------------------------------------|------------------------------------------|
| ![image](https://github.com/user-attachments/assets/e10f34a1-413b-491c-9916-4c7d056681f2)   | ![image](https://github.com/user-attachments/assets/21531700-cf80-4c0c-9d13-c97d09c8462c)   |

---

## Demo GIF  

![Screen_recording_20241126_195148-ezgif com-video-to-gif-converter](https://github.com/user-attachments/assets/e98a6399-a16a-4712-988a-79053e8c0205)


---

## How to Run  

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/AdvancedLazyList-DarkMode.git
