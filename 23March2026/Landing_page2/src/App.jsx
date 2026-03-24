import Hero from "./components/ui/Hero";
import NavBar from "./components/ui/NavBar";

function App() {
  return (
    <>
      <div className="bg-black min-h-screen text-white">
        <NavBar />
        <Hero />
      </div>
    </>
  );
}
export default App;
