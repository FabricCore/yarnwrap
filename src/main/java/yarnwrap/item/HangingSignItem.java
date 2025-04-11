package yarnwrap.item;
public class HangingSignItem { public net.minecraft.item.HangingSignItem wrapperContained; public HangingSignItem(net.minecraft.item.HangingSignItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public HangingSignItem(yarnwrap.block.Block hangingSign,yarnwrap.block.Block wallHangingSign,Object settings) { this.wrapperContained = new net.minecraft.item.HangingSignItem(hangingSign.wrapperContained,wallHangingSign.wrapperContained,settings); }

}