import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * File Access Object that handles two files, one for read and the other for
 * write
 * 
 * @author Jaineel Nandu
 * @version 20201204
 */
public class FileAccess {
    private RandomAccessFile file;
    private byte[] blockBytes;
    @SuppressWarnings("unused")
    private int eof = 0;
    private RandomAccessFile runFile;

    /**
     * Constructor to initialize FileAccess object.
     * 
     * @param readName
     *            String: name of the read file.
     * @param writeName
     *            String: name of the write file.
     * @throws FileNotFoundException
     */
    public FileAccess(String readName, String writeName)
        throws FileNotFoundException {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Gets a block of data from the file at current pointer.
     * 
     * @return
     *         Array of Records
     * @throws IOException
     */
    public Record[] getBlock() throws IOException {
        eof = file.read(blockBytes);
        Record[] block = new Record[512];
        /*
            Implementation hidden, contact Author
        */
        return block;

    }


    /**
     * Gets a block of data from the file at given pointer.
     * 
     * @param pos
     *            pointer from where to read the file.
     * @return
     *         Array of Records.
     * @throws IOException
     */
    public Record[] getBlock(long pos) throws IOException {
        file.seek(pos);
        eof = file.read(blockBytes);
        /*
            Implementation hidden, contact Author
        */
        return block;
    }


    /**
     * Returns part of a block from given start to given end position.
     * 
     * @param pos
     *            Pointer from where to start reading.
     * @param end
     *            Pointer at which to end reading.
     * @return
     *         Array of Records.
     * @throws IOException
     */
    public Record[] getPartialBlock(long pos, long end) throws IOException {
        file.seek(pos);
        byte[] readBytes = new byte[(int)(end - pos)];
        Record[] fin = new Record[(int)(end - pos) / 16];
        /*
            Implementation hidden, contact Author
        */
        return fin;
    }


    /**
     * Tells if we have reached the end of read file.
     * 
     * @return
     *         boolean: true if end of read file.
     * @throws IOException
     */
    public boolean isEndOfReadFile() throws IOException {
        return file.getFilePointer() == file.length();
    }


    /**
     * Gets the pointer at which the read file is currently pointing.
     * 
     * @return
     *         long: current pointer of the read file.
     * @throws IOException
     */
    public long getReadPointer() throws IOException {
        return file.getFilePointer();
    }


    /**
     * Writes a block or partial block to the write file
     * 
     * @param b
     *            Array of blocks to write.
     * @throws IOException
     */
    public void writeBlock(Record[] b) throws IOException {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Writes a record to the file
     * 
     * @param b
     *            Record to be written.
     * @throws IOException
     */
    public void writeRecord(Record b) throws IOException {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Gets the position of the write file.
     * 
     * @return
     *         long: pointer of the current wrie file location.
     * @throws IOException
     */
    public long getWriteFilePointer() throws IOException {
        return runFile.getFilePointer();
    }


    /**
     * Gets the length of the read file.
     * 
     * @return
     *         long: Length of the read file.
     * @throws IOException
     */
    public long getReadLength() throws IOException {
        return file.length();
    }


    /**
     * Gets the length of the write file.
     * 
     * @return Length of the write file.
     * @throws IOException
     */
    public long getWriteLength() throws IOException {
        return runFile.length();
    }
}
