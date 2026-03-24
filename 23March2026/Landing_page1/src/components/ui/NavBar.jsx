import { FaFacebook, FaLinkedin, FaInstagram } from "react-icons/fa";
function NavBar() {
  return (
    <>
      <div className="flex justify-between pl-20 px-5 py-3 font-serif">
        <div className="flex gap-5">
          <div className=" text-3xl font-sans font-bold">SteveEditor</div>
        </div>
        <div className="flex gap-5">
          <div>Main</div>
          <div>About</div>
          <div>Program</div>
          <div>Price</div>
          <div>Contact</div>
        </div>
        <div className="flex gap-5">
          <div className="flex pr-20 text-xl">
            <FaFacebook></FaFacebook>
            <FaLinkedin></FaLinkedin>
            <FaInstagram></FaInstagram>
          </div>
        </div>
      </div>
    </>
  );
}
export default NavBar;
