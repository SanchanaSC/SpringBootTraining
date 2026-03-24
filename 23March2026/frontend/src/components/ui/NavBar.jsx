function NavBar() {
    return(
        <>
        <div className="flex justify-between px-5 py-3">
            <div className="flex gap-5">
                <div>LOGO</div>
                <div>JCBM COLLEGE</div>
            </div>
            <div className="flex gap-5">
                <div>Home</div>
                <div>About Us</div>
                <div>Services</div>
                <div>Products</div>
                <div>Contact Us</div>
            </div>
            <div className="flex gap-5">
                <div>Signup</div>
                <div>Login</div>
            </div>
        </div>
        </>
    )
}
export default NavBar;