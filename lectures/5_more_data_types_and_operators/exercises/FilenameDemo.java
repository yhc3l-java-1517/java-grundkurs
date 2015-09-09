class FilenameDemo {
    public static void main(String[] args) {
        String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}

/*
	Expected output

	Extension = html
	Filename = index
	Path = /home/user
*/