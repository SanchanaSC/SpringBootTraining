import Count from "./component/Count";
import GradingSy from "./component/Gradingsy";
import GuessNo from "./component/GuessNo";
import GuessStr from "./component/GuessStr";
import ListDisplay from "./component/ListDisplay";
import Passfail from "./component/PaaFail";
import PrimeNo from "./component/PrimeNo";
import ListP from "./component/PrimeNoList";
import PrimeNoList from "./component/PrimeNoList";
import Switch from "./component/Switch";

function App(){
  
  return(
    <>
      <div>
        <Count/>
        <Switch/>
        <br/>
        <GuessNo/>
        <GuessStr/>
        <br/>
        <GradingSy/>
        <br/>
        <ListDisplay/>
        <br/>
        <PrimeNo/>
        <br/>
        {/* <PrimeNoList/> */}
        <ListP/>

        <br/>
        <Passfail/>
      </div>
    </>
  ) 
}

export default App;


