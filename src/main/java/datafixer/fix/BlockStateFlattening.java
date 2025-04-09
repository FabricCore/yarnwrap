package yarnwrap.datafixer.fix;
public class BlockStateFlattening { public net.minecraft.datafixer.fix.BlockStateFlattening wrapperContained; public BlockStateFlattening(net.minecraft.datafixer.fix.BlockStateFlattening wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap OLD_STATE_TO_ID() { return wrapperContained.OLD_STATE_TO_ID; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public it.unimi.dsi.fastutil.objects.Object2IntMap OLD_BLOCK_TO_ID() { return wrapperContained.OLD_BLOCK_TO_ID; }
// public com.mojang.serialization.Dynamic[] OLD_STATE_TO_DYNAMIC() { return wrapperContained.OLD_STATE_TO_DYNAMIC; }
// public com.mojang.serialization.Dynamic[] OLD_BLOCK_TO_DYNAMIC() { return wrapperContained.OLD_BLOCK_TO_DYNAMIC; }
// public java.lang.String FILTER_ME() { return wrapperContained.FILTER_ME; }
public com.mojang.serialization.Dynamic lookupState(int stateId) { return wrapperContained.lookupState(stateId); }
// public void putStates(int oldIdAndMeta,java.lang.String newStateStr,java.lang.String[] oldStateStrings) { wrapperContained.putStates(oldIdAndMeta,newStateStr,oldStateStrings); }
// public com.mojang.serialization.Dynamic lookupState() { return wrapperContained.lookupState(); }
public com.mojang.serialization.Dynamic parseState(java.lang.String stateStr) { return wrapperContained.parseState(stateStr); }
public java.lang.String lookupStateBlock(int stateId) { return wrapperContained.lookupStateBlock(stateId); }
public java.lang.String lookupBlock(java.lang.String oldBlockName) { return wrapperContained.lookupBlock(oldBlockName); }
// public void fillEmptyStates() { wrapperContained.fillEmptyStates(); }
// public void putStatesFromBlocks0To15() { wrapperContained.putStatesFromBlocks0To15(); }
// public void putStatesFromBlocks16To31() { wrapperContained.putStatesFromBlocks16To31(); }
// public void putStatesFromBlocks32To47() { wrapperContained.putStatesFromBlocks32To47(); }
// public void putStatesFromBlocks48To63() { wrapperContained.putStatesFromBlocks48To63(); }
// public void putStatesFromBlocks64To79() { wrapperContained.putStatesFromBlocks64To79(); }
// public void putStatesFromBlocks80To95() { wrapperContained.putStatesFromBlocks80To95(); }
// public void putStatesFromBlocks96To111() { wrapperContained.putStatesFromBlocks96To111(); }
// public void putStatesFromBlocks112To127() { wrapperContained.putStatesFromBlocks112To127(); }
// public void putStatesFromBlocks128To143() { wrapperContained.putStatesFromBlocks128To143(); }
// public void putStatesFromBlocks144To159() { wrapperContained.putStatesFromBlocks144To159(); }
// public void putStatesFromBlocks160To175() { wrapperContained.putStatesFromBlocks160To175(); }
// public void putStatesFromBlocks176To191() { wrapperContained.putStatesFromBlocks176To191(); }
// public void putStatesFromBlocks192To207() { wrapperContained.putStatesFromBlocks192To207(); }
// public void putStatesFromBlocks208To223() { wrapperContained.putStatesFromBlocks208To223(); }
// public void putStatesFromBlocks224To239() { wrapperContained.putStatesFromBlocks224To239(); }
// public void putStatesFromBlocks240To255() { wrapperContained.putStatesFromBlocks240To255(); }

}