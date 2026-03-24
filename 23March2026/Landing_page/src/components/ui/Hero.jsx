function Hero() {
  return (
    <>
      <section className="flex w-full justify-center items-center h-75">
        <div className="text-center flex flex-col items-center">
          <div className="text-6xl pb-5 font-serif italic">
            Find the best 🚀 flights faster
          </div>
          <div className="text-5xl pb-5 text-gray-400 font font-sans italic">
            Travel smarter
          </div>
        </div>
      </section>
      <section className="flex w-full gap-5  pl-85">
        <div>Round trip ▼</div>
        <div>Passengers ▼</div>
      </section>
      <section className="flex w-full gap-5 pl-85">
        <div className="bg-gray-300 border-gray-50 rounded w-56 h-16 px-4 py-2 font-semibold">
          From
          <br />
          Warsaw,Poland
        </div>

        <div className="w-56 h-16 px-4 py-2 bg-gray-300 border-gray-50 font-semibold">
          To
          <br />
          Bangkok,Thailand
        </div>

        <div className="bg-black text-white rounded px-5 py-3 flex justify-center items-center w-30 font-semibold">
          <button className="flex justify-center items-center w-full h-full">
            Search
          </button>
        </div>
      </section>
    </>
  );
}
export default Hero;
