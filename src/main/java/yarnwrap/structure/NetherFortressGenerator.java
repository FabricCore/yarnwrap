package yarnwrap.structure;
public class NetherFortressGenerator { public net.minecraft.structure.NetherFortressGenerator wrapperContained; public NetherFortressGenerator(net.minecraft.structure.NetherFortressGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object ALL_CORRIDOR_PIECES() { return wrapperContained.ALL_CORRIDOR_PIECES; }
// // public void ALL_CORRIDOR_PIECES(Object value) { wrapperContained.ALL_CORRIDOR_PIECES = value; }
// public Object ALL_BRIDGE_PIECES() { return wrapperContained.ALL_BRIDGE_PIECES; }
// // public void ALL_BRIDGE_PIECES(Object value) { wrapperContained.ALL_BRIDGE_PIECES = value; }
// public Object createPiece(Object pieceData,yarnwrap.structure.StructurePiecesHolder holder,yarnwrap.util.math.random.Random random,int x,int y,int z,yarnwrap.util.math.Direction orientation,int chainLength) { return wrapperContained.createPiece(pieceData,holder.wrapperContained,random.wrapperContained,x,y,z,orientation.wrapperContained,chainLength); }

}