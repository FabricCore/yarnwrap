package yarnwrap.item;
public class HoeItem { public net.minecraft.item.HoeItem wrapperContained; public HoeItem(net.minecraft.item.HoeItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map TILLING_ACTIONS() { return wrapperContained.TILLING_ACTIONS; }
// public void TILLING_ACTIONS(java.util.Map value) { wrapperContained.TILLING_ACTIONS = value; }
public java.util.function.Consumer createTillAndDropAction(yarnwrap.block.BlockState result,yarnwrap.item.ItemConvertible droppedItem) { return wrapperContained.createTillAndDropAction(result.wrapperContained,droppedItem.wrapperContained); }
public boolean canTillFarmland(yarnwrap.item.ItemUsageContext context) { return wrapperContained.canTillFarmland(context.wrapperContained); }
public java.util.function.Consumer createTillAction(yarnwrap.block.BlockState result) { return wrapperContained.createTillAction(result.wrapperContained); }

}