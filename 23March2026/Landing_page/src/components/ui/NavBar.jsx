function NavBar() {
  return (
    <>
      <div className="flex justify-between pl-20 px-5 py-3 font-serif">
        <div className="flex gap-5">
          <div>Sky Explorer</div>
        </div>
        <div className="flex gap-5">
          <div>Features</div>
          <div>Method</div>
          <div>Pricing</div>
          <div>Changelog</div>
        </div>
        <div className="flex gap-5">
          <div className="pr-20">
            <button className="bg-gray-300 text-black text-center border-gray-500 rounded px-5 py-1">
              Login
            </button>
          </div>
        </div>
      </div>
    </>
  );
}
export default NavBar;
