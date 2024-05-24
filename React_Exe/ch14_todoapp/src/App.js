import "./App.css";
import TodoTemplate from "./ex03_TodoList/TodoTemplate";
import TodoInsert from "./ex03_TodoList/TodoInsert";
import TodoList from "./ex03_TodoList/TodoList";

function App() {
  return (
    <TodoTemplate>
      <TodoInsert />
      <TodoList />
    </TodoTemplate>
  );
}

export default App;
