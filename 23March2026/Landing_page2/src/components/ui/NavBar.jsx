function NavBar() {
  return (
    <>
      <div className="flex justify-between pl-20 px-5 py-3 font-serif">
        <div className="flex gap-5">
          <div>Logo</div>
        </div>
        <div className="flex gap-5 border-gray-500 rounded-b-2xl">
          <div>Home</div>
          <div>DeFi App</div>
          <div>Assets</div>
          <div>Features</div>
          <div>Pricing</div>
          <div>FAQ</div>
          <div>Protection↗</div>
        </div>
        <div className="flex gap-5">
          <div className="pr-20">
            <button className="bg-black text-white text-center border-gray-500 rounded px-5 py-1">
              👤Create Account
            </button>
          </div>
        </div>
      </div>
    </>
  );
}
export default NavBar;
