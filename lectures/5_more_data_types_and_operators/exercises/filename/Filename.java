class Filename {
    String fullPath;
    char pathSeparator, 
         extensionSeparator;

    Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    // get the type of file it is ie. the characters after the extension seperator
    String extension() {
    }

    // gets filename without extension
    String filename() {
    }

    // gets the path i.e. everything excluding the filename
    String path() {
    }
}