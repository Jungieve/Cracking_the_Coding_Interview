package Bit;

/**
 * Created by ZihanCong on 16/7/13.
 */
public class BitImpl implements  IBit{
    @Override
    public boolean getBit(int num, int i) {
        //将1左移i位与num做与
        return ((num & (1 << i)) == 0);
    }

    @Override
    public int setBit(int num, int i) {
        //将1左移i位与num做or
        return ((num | (1 << i)));
    }

    @Override
    public int clearBit(int num, int i) {
        return (num & (~(1 << i)));
    }

    @Override
    public int clearBitsMSthroughtI(int num, int i) {
        return num & ((1<<i)-1);
    }

    @Override
    public int clearBitsIthrough0(int num, int i) {
        return num & (~((1<<i)-1));
    }

    @Override
    public int updateBit(int num, int i, int v) {
        return (num & (~(1 << i))) | (v >> i);
    }
}
