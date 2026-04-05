import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import { getTodoById, updateTodo } from "../services/todoService";

export default function EditTodo() {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  const navigate = useNavigate();
  const { id } = useParams();

  const fetchTodoById = async () => {
    try {
      const response = await getTodoById(id);
      const todo = response.data.data;
      setTitle(todo.title);
      setDescription(todo.description);
    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    fetchTodoById();
  }, [id]);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const updatedTodo = {
      title,
      description,
    };

    try {
      await updateTodo(id, updatedTodo);
      navigate("/");
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <>
      <h1>Edit Todo</h1>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Title:</label>
          <input
            type="text"
            value={title}
            onChange={(e) => setTitle(e.target.value)}
            required
          />
        </div>

        <div>
          <label>Description:</label>
          <input
            type="text"
            value={description}
            onChange={(e) => setDescription(e.target.value)}
            required
          />
        </div>

        <button type="submit">Update</button>
      </form>
    </>
  );
}
