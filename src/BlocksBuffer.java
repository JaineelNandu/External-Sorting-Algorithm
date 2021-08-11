import java.util.Arrays;

/**
 * Buffer Class that stores blocks of Records.
 * 
 * @author Jaineel Nandu
 *
 * @version 20201204
 */
public class BlocksBuffer {
    private Record[] block;
    private int bufferFill;

    /**
     * Constructor to initialize buffer blocks
     * 
     * @param numBlocks
     *            number of blocks to store in buffer.
     */
    public BlocksBuffer(int numBlocks) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Inserts block of data to this buffer.
     * 
     * @param b
     *            Block of records to be inserted.
     */
    public void insertBlock(Record[] b) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Removes a record from the end of the buffer.
     * 
     * @return
     *         Record at the end of the buffer.
     */
    public Record removeLastRecord() {
        Record r1 = null;
        /*
            Implementation hidden, contact Author
        */
        return r1;
    }


    /**
     * Removes from the front of the buffer
     * 
     * @return
     *         Record at the front of the buffer.
     */
    public Record removeFirstRecord() {
        Record ret;
        /*
            Implementation hidden, contact Author
        */
        return ret;
    }


    /**
     * Inserts a record at the end of the buffer
     * 
     * @param r
     *            Record to be inserted.
     */
    public void insertLastRecord(Record r) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Removes the block of buffer data present inside.
     * 
     * @return
     *         Array of records in the buffer.
     */
    public Record[] removeBlock() {
        Record[] ret = null;
        /*
            Implementation hidden, contact Author
        */
        return ret;
    }


    /**
     * Gets the first Record without removing it.
     * 
     * @return
     *         Record in the front.
     */
    public Record getFirst() {
        return block[0];
    }


    /**
     * Tells if the buffer is empty or not.
     * 
     * @return
     *         boolean: true if the buffer is empty.
     */
    public boolean isEmpty() {
        return bufferFill == 0;
    }


    /**
     * Tells if the buffer is full or not.
     * 
     * @return
     *         boolean: true if buffer is full.
     */
    public boolean isFull() {
        return bufferFill == block.length;
    }
}
