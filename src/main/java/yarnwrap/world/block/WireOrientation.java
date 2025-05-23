package yarnwrap.world.block;
public class WireOrientation { public net.minecraft.world.block.WireOrientation wrapperContained; public WireOrientation(net.minecraft.world.block.WireOrientation wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.world.block.WireOrientation.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.world.block.WireOrientation.PACKET_CODEC = value.wrapperContained; }

// public net.minecraft.world.block.WireOrientation[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.world.block.WireOrientation[] value) { wrapperContained.VALUES = value; }
// public static net.minecraft.world.block.WireOrientation[] VALUES() { return net.minecraft.world.block.WireOrientation.VALUES; }
// public static void VALUES(net.minecraft.world.block.WireOrientation[] value, ) { net.minecraft.world.block.WireOrientation.VALUES = value; }

// public yarnwrap.util.math.Direction up() { return new yarnwrap.util.math.Direction(wrapperContained.up); }
// public void up(yarnwrap.util.math.Direction value) { wrapperContained.up = value.wrapperContained; }
// public static yarnwrap.util.math.Direction up() { return new yarnwrap.util.math.Direction(net.minecraft.world.block.WireOrientation.up); }
// public static void up(yarnwrap.util.math.Direction value, ) { net.minecraft.world.block.WireOrientation.up = value.wrapperContained; }

// public yarnwrap.util.math.Direction front() { return new yarnwrap.util.math.Direction(wrapperContained.front); }
// public void front(yarnwrap.util.math.Direction value) { wrapperContained.front = value.wrapperContained; }
// public static yarnwrap.util.math.Direction front() { return new yarnwrap.util.math.Direction(net.minecraft.world.block.WireOrientation.front); }
// public static void front(yarnwrap.util.math.Direction value, ) { net.minecraft.world.block.WireOrientation.front = value.wrapperContained; }

// public yarnwrap.util.math.Direction right() { return new yarnwrap.util.math.Direction(wrapperContained.right); }
// public void right(yarnwrap.util.math.Direction value) { wrapperContained.right = value.wrapperContained; }
// public static yarnwrap.util.math.Direction right() { return new yarnwrap.util.math.Direction(net.minecraft.world.block.WireOrientation.right); }
// public static void right(yarnwrap.util.math.Direction value, ) { net.minecraft.world.block.WireOrientation.right = value.wrapperContained; }

// public Object sideBias() { return wrapperContained.sideBias; }
// // public void sideBias(Object value) { wrapperContained.sideBias = value; }
// // public static Object sideBias() { return net.minecraft.world.block.WireOrientation.sideBias; }
// // public static void sideBias(Object value, ) { net.minecraft.world.block.WireOrientation.sideBias = value; }

// public int ordinal() { return wrapperContained.ordinal; }
// public void ordinal(int value) { wrapperContained.ordinal = value; }
// public static int ordinal() { return net.minecraft.world.block.WireOrientation.ordinal; }
// public static void ordinal(int value, ) { net.minecraft.world.block.WireOrientation.ordinal = value; }

// public java.util.List directionsByPriority() { return wrapperContained.directionsByPriority; }
// public void directionsByPriority(java.util.List value) { wrapperContained.directionsByPriority = value; }
// public static java.util.List directionsByPriority() { return net.minecraft.world.block.WireOrientation.directionsByPriority; }
// public static void directionsByPriority(java.util.List value, ) { net.minecraft.world.block.WireOrientation.directionsByPriority = value; }

// public java.util.List horizontalDirections() { return wrapperContained.horizontalDirections; }
// public void horizontalDirections(java.util.List value) { wrapperContained.horizontalDirections = value; }
// public static java.util.List horizontalDirections() { return net.minecraft.world.block.WireOrientation.horizontalDirections; }
// public static void horizontalDirections(java.util.List value, ) { net.minecraft.world.block.WireOrientation.horizontalDirections = value; }

// public java.util.List verticalDirections() { return wrapperContained.verticalDirections; }
// public void verticalDirections(java.util.List value) { wrapperContained.verticalDirections = value; }
// public static java.util.List verticalDirections() { return net.minecraft.world.block.WireOrientation.verticalDirections; }
// public static void verticalDirections(java.util.List value, ) { net.minecraft.world.block.WireOrientation.verticalDirections = value; }

// public java.util.Map siblingsByFront() { return wrapperContained.siblingsByFront; }
// public void siblingsByFront(java.util.Map value) { wrapperContained.siblingsByFront = value; }
// public static java.util.Map siblingsByFront() { return net.minecraft.world.block.WireOrientation.siblingsByFront; }
// public static void siblingsByFront(java.util.Map value, ) { net.minecraft.world.block.WireOrientation.siblingsByFront = value; }

// public java.util.Map siblingsByUp() { return wrapperContained.siblingsByUp; }
// public void siblingsByUp(java.util.Map value) { wrapperContained.siblingsByUp = value; }
// public static java.util.Map siblingsByUp() { return net.minecraft.world.block.WireOrientation.siblingsByUp; }
// public static void siblingsByUp(java.util.Map value, ) { net.minecraft.world.block.WireOrientation.siblingsByUp = value; }

// public java.util.Map siblingsBySideBias() { return wrapperContained.siblingsBySideBias; }
// public void siblingsBySideBias(java.util.Map value) { wrapperContained.siblingsBySideBias = value; }
// public static java.util.Map siblingsBySideBias() { return net.minecraft.world.block.WireOrientation.siblingsBySideBias; }
// public static void siblingsBySideBias(java.util.Map value, ) { net.minecraft.world.block.WireOrientation.siblingsBySideBias = value; }

// public WireOrientation(yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front,Object sideBias) { this.wrapperContained = new net.minecraft.world.block.WireOrientation(up.wrapperContained,front.wrapperContained,sideBias); }
public yarnwrap.world.block.WireOrientation withOppositeSideBias() { return new yarnwrap.world.block.WireOrientation(wrapperContained.withOppositeSideBias()); }
// public static yarnwrap.world.block.WireOrientation withOppositeSideBias() { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.withOppositeSideBias()); }
// public yarnwrap.world.block.WireOrientation fromOrdinal(int ordinal) { return new yarnwrap.world.block.WireOrientation(wrapperContained.fromOrdinal(ordinal)); }
// public static yarnwrap.world.block.WireOrientation fromOrdinal(int ordinal, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.fromOrdinal(ordinal)); }
// public yarnwrap.world.block.WireOrientation random(yarnwrap.util.math.random.Random random) { return new yarnwrap.world.block.WireOrientation(wrapperContained.random(random.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation random(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.random(random.wrapperContained)); }
// public yarnwrap.world.block.WireOrientation withSideBias(Object sideBias) { return new yarnwrap.world.block.WireOrientation(wrapperContained.withSideBias(sideBias)); }
// public static yarnwrap.world.block.WireOrientation withSideBias(Object sideBias, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.withSideBias(sideBias)); }
// public yarnwrap.world.block.WireOrientation initializeValuesArray(yarnwrap.world.block.WireOrientation prime,net.minecraft.world.block.WireOrientation[] valuesOut) { return new yarnwrap.world.block.WireOrientation(wrapperContained.initializeValuesArray(prime.wrapperContained,valuesOut)); }
// public static yarnwrap.world.block.WireOrientation initializeValuesArray(yarnwrap.world.block.WireOrientation prime,net.minecraft.world.block.WireOrientation[] valuesOut, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.initializeValuesArray(prime.wrapperContained,valuesOut)); }
public yarnwrap.world.block.WireOrientation withUp(yarnwrap.util.math.Direction direction) { return new yarnwrap.world.block.WireOrientation(wrapperContained.withUp(direction.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation withUp(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.withUp(direction.wrapperContained)); }
// public yarnwrap.world.block.WireOrientation of(yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front,Object sideBias) { return new yarnwrap.world.block.WireOrientation(wrapperContained.of(up.wrapperContained,front.wrapperContained,sideBias)); }
// public static yarnwrap.world.block.WireOrientation of(yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front,Object sideBias, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.of(up.wrapperContained,front.wrapperContained,sideBias)); }
public yarnwrap.util.math.Direction getFront() { return new yarnwrap.util.math.Direction(wrapperContained.getFront()); }
// public static yarnwrap.util.math.Direction getFront() { return new yarnwrap.util.math.Direction(net.minecraft.world.block.WireOrientation.getFront()); }
public yarnwrap.world.block.WireOrientation withFront(yarnwrap.util.math.Direction direction) { return new yarnwrap.world.block.WireOrientation(wrapperContained.withFront(direction.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation withFront(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.withFront(direction.wrapperContained)); }
// public int ordinalFromComponents(yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front,Object sideBias) { return wrapperContained.ordinalFromComponents(up.wrapperContained,front.wrapperContained,sideBias); }
// public static int ordinalFromComponents(yarnwrap.util.math.Direction up,yarnwrap.util.math.Direction front,Object sideBias, ) { return net.minecraft.world.block.WireOrientation.ordinalFromComponents(up.wrapperContained,front.wrapperContained,sideBias); }
public yarnwrap.util.math.Direction getUp() { return new yarnwrap.util.math.Direction(wrapperContained.getUp()); }
// public static yarnwrap.util.math.Direction getUp() { return new yarnwrap.util.math.Direction(net.minecraft.world.block.WireOrientation.getUp()); }
public yarnwrap.world.block.WireOrientation withFrontAndSideBias(yarnwrap.util.math.Direction direction) { return new yarnwrap.world.block.WireOrientation(wrapperContained.withFrontAndSideBias(direction.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation withFrontAndSideBias(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.withFrontAndSideBias(direction.wrapperContained)); }
public yarnwrap.util.math.Direction getRight() { return new yarnwrap.util.math.Direction(wrapperContained.getRight()); }
// public static yarnwrap.util.math.Direction getRight() { return new yarnwrap.util.math.Direction(net.minecraft.world.block.WireOrientation.getRight()); }
// public boolean method_61855(yarnwrap.util.math.Direction direction) { return wrapperContained.method_61855(direction.wrapperContained); }
// public static boolean method_61855(yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.block.WireOrientation.method_61855(direction.wrapperContained); }
public Object getSideBias() { return wrapperContained.getSideBias(); }
// public static Object getSideBias() { return net.minecraft.world.block.WireOrientation.getSideBias(); }
// public boolean method_61857(yarnwrap.util.math.Direction direction) { return wrapperContained.method_61857(direction.wrapperContained); }
// public static boolean method_61857(yarnwrap.util.math.Direction direction, ) { return net.minecraft.world.block.WireOrientation.method_61857(direction.wrapperContained); }
public java.util.List getDirectionsByPriority() { return wrapperContained.getDirectionsByPriority(); }
// public static java.util.List getDirectionsByPriority() { return net.minecraft.world.block.WireOrientation.getDirectionsByPriority(); }
public java.util.List getHorizontalDirections() { return wrapperContained.getHorizontalDirections(); }
// public static java.util.List getHorizontalDirections() { return net.minecraft.world.block.WireOrientation.getHorizontalDirections(); }
public java.util.List getVerticalDirections() { return wrapperContained.getVerticalDirections(); }
// public static java.util.List getVerticalDirections() { return net.minecraft.world.block.WireOrientation.getVerticalDirections(); }
// public int ordinal() { return wrapperContained.ordinal(); }
// // public static int ordinal() { return net.minecraft.world.block.WireOrientation.ordinal(); }
public yarnwrap.world.block.WireOrientation withFrontIfNotUp(yarnwrap.util.math.Direction direction) { return new yarnwrap.world.block.WireOrientation(wrapperContained.withFrontIfNotUp(direction.wrapperContained)); }
// public static yarnwrap.world.block.WireOrientation withFrontIfNotUp(yarnwrap.util.math.Direction direction, ) { return new yarnwrap.world.block.WireOrientation(net.minecraft.world.block.WireOrientation.withFrontIfNotUp(direction.wrapperContained)); }

}