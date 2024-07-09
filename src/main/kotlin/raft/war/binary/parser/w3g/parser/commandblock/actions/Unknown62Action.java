package raft.war.binary.parser.w3g.parser.commandblock.actions;

import raft.war.binary.parser.w3g.parser.commandblock.IAction;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

public class Unknown62Action implements IAction {

    public static final byte ACTION_ID = 0x62;

    private int unknownA;
    private int unknownB;
    private int unknownC;


    @Override
    public void parse(ByteBuffer inBuffer) {
        unknownA = inBuffer.getInt();
        unknownB = inBuffer.getInt();
        unknownC = inBuffer.getInt();
    }

    @Override
    public ByteBuffer assembly(ByteBuffer outBuffer) {
        if (outBuffer == null) {
            outBuffer = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
        }

        outBuffer.putInt(unknownA);
        outBuffer.putInt(unknownB);
        outBuffer.putInt(unknownC);

        return outBuffer;
    }

    @Override
    public byte actionId() {
        return ACTION_ID;
    }

    public int getUnknownA() {
        return unknownA;
    }

    public Unknown62Action setUnknownA(int unknownA) {
        this.unknownA = unknownA;
        return this;
    }

    public int getUnknownB() {
        return unknownB;
    }

    public Unknown62Action setUnknownB(int unknownB) {
        this.unknownB = unknownB;
        return this;
    }

    public int getUnknownC() {
        return unknownC;
    }

    public Unknown62Action setUnknownC(int unknownC) {
        this.unknownC = unknownC;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Unknown62Action that))
            return false;
        return unknownA == that.unknownA && unknownB == that.unknownB && unknownC == that.unknownC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unknownA, unknownB, unknownC);
    }
}
