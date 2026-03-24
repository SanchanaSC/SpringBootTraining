function Hero() {
  return (
    <>
      <section className="flex w-full justify-center items-center h-75">
        <div className="text-center flex flex-col items-center">
          <div>▶</div>
          <button className=" border-gray-200 rounded">
            Unlock Your Assets Spark➝
          </button>
          <div className="text-6xl pb-5 font-serif bold">
            One-click for Asset Defense
          </div>
          <div className="text-xl pb-5 font-sans">
            Dive into the art assets,where innovative blockchain technology
            meets financial expertise
          </div>
        </div>
      </section>
      <section className="flex justify-center items-center gap-4">
        <div className="bg-black text-white rounded-full px-6 py-2 flex justify-center items-center font-semibold">
          <button className="flex justify-center items-center">
            Open App ↗
          </button>
        </div>

        <div>
          <button className="bg-white text-black rounded-full px-6 py-2 font-semibold">
            Discover More
          </button>
        </div>
      </section>
    </>
  );
}
export default Hero;
