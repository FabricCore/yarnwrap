package yarnwrap.block;
public class NoteBlock { public net.minecraft.block.NoteBlock wrapperContained; public NoteBlock(net.minecraft.block.NoteBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.IntProperty NOTE() { return new yarnwrap.state.property.IntProperty(wrapperContained.NOTE); }
// public void NOTE(yarnwrap.state.property.IntProperty value) { wrapperContained.NOTE = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty INSTRUMENT() { return new yarnwrap.state.property.EnumProperty(wrapperContained.INSTRUMENT); }
// public void INSTRUMENT(yarnwrap.state.property.EnumProperty value) { wrapperContained.INSTRUMENT = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty POWERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.POWERED); }
// public void POWERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.POWERED = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public void playNote(yarnwrap.entity.Entity entity,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.playNote(entity.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getStateWithInstrument(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.getStateWithInstrument(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public yarnwrap.util.Identifier getCustomSound(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.Identifier(wrapperContained.getCustomSound(world.wrapperContained,pos.wrapperContained)); }
public float getNotePitch(int note) { return wrapperContained.getNotePitch(note); }

}