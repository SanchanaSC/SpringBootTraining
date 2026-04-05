import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import TodoList from "./pages/TodoList";
import CreateTodo from "./pages/CreateTodo";
import EditTodo from "./pages/EditTodo";

export default function App() {
  return (
    <>
      <BrowserRouter>
        <nav>
          <Link to="/">Home </Link>
          <Link to="/create"> Create</Link>
        </nav>
        <Routes>
          <Route path="/" element={<TodoList />} />
          <Route path="/create" element={<CreateTodo />} />
          <Route path="/edit/:id" element={<EditTodo />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}
