class FilenameDemo {
    public static void main(String[] args) {
        String FPATH = "/home/user/index.html";
        String FPATH2 = "/home/user/tablackmore/test.txt";
        
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
        
        System.out.println();
        
        Filename myFile = new Filename(FPATH2, '/', '.');
        System.out.println("Extension = " + myFile.extension());
        System.out.println("Filename = " + myFile.filename());
        System.out.println("Path = " + myFile.path());
    }
}

/*
    Expected output

    Extension = html
    Filename = index
    Path = /home/user
    
    Extension = txt
    Filename = test
    Path = /home/user/tablackmore
*/