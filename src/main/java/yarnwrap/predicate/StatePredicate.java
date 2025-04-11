package yarnwrap.predicate;
public class StatePredicate { public net.minecraft.predicate.StatePredicate wrapperContained; public StatePredicate(net.minecraft.predicate.StatePredicate wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List conditions() { return wrapperContained.conditions; }
// public void conditions(java.util.List value) { wrapperContained.conditions = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public com.mojang.serialization.Codec CONDITION_LIST_CODEC() { return wrapperContained.CONDITION_LIST_CODEC; }
// public void CONDITION_LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.CONDITION_LIST_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public java.util.List conditions() { return wrapperContained.conditions(); }
public boolean test(yarnwrap.block.BlockState state) { return wrapperContained.test(state.wrapperContained); }
public boolean test(yarnwrap.state.StateManager stateManager,yarnwrap.state.State container) { return wrapperContained.test(stateManager.wrapperContained,container.wrapperContained); }
public boolean test(yarnwrap.fluid.FluidState state) { return wrapperContained.test(state.wrapperContained); }
public java.util.Optional findMissing(yarnwrap.state.StateManager stateManager) { return wrapperContained.findMissing(stateManager.wrapperContained); }

}