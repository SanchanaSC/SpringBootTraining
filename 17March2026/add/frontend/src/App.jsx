import { useState, useEffect } from "react";
import axios from "axios";
import Addition from "./components/Addition";



function App() {
  const [data, setData] = useState(null);

  useEffect(() => {
    axios
      .get("http://localhost:8080/hello")
      .then((res) => {
        console.log(res.data);
        setData(res.data);
      })
      .catch((err) => console.log(err));
  }, []);

  return (
    // <div>
    //   <h1>{data?.message}</h1>
    //   <p>{data?.description}</p>
    // </div>
    <Addition/>
  );
}

export default App;
