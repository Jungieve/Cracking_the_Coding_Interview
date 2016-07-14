package Bit;

/**
 * Created by ZihanCong on 16/7/13.
 */
public interface IBit {
    //获取第i位的bit值
    boolean getBit(int num,int i);
    //将第i位的bit值设置为1
    int setBit(int num,int i);
    //将第i位的bit值设置清零
    int clearBit(int num,int i);
    //将num最高位至第i位(含)清零
    int clearBitsMSthroughtI(int num,int i);
    //将第i位到第0位清零
    int clearBitsIthrough0(int num,int i);
    //更新第i位
    int updateBit(int num,int i,int v);
}
