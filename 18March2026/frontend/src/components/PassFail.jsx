import { useState } from "react";
import {z} from "zod";


function PassFail() {
    const [marks,setMarks]=useState("");
    const [result,setResult]=useState("");

    const schema = z.number().min(0).max(100);

    function checkResult() {
        const parsedNumber = Number(marks);
        const validation = schema.safeParse(parsedNumber);

        if(!validation.success) {
            setResult("Invalid Marks");
            return;
        }
        if(parsedNumber>=35){
            setResult("Pass");
        } else {
            setResult("fail");
        }
    };
    return (
        <>
        <div>Enter the Marks</div>
        <input type="number"
        value={marks}
        onChange={(e) => setMarks(e.target.value)}
        />

        <button onClick={checkResult}>Result</button>
        <h3>{result}</h3>
        </>
    )
}
export default PassFail;