import { useState } from "react"

function SwitchFunction() {
    const [count,setCount]=useState(true);

    const switchDemo = () => {
        setCount(!count);
    };
    return (
        <>
        <div>
        {count && <div>True</div>}
        {!count && <div>False</div>}
        <button onClick={switchDemo}>Update state</button>
        </div>
        </>
    );
}
export default SwitchFunction;