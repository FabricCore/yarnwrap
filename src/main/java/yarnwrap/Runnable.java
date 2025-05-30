package yarnwrap;

import java.util.List;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

public class Runnable extends RunnableGenerated implements
ItemTooltipCallback
{
    public Runnable(String ident, String function) {
        super(ident, function);
    }

    @Override
    public void getTooltip(ItemStack stack, TooltipContext tooltipContext, TooltipType tooltipType, List<Text> lines) {
        runF(new yarnwrap.item.ItemStack(stack), tooltipType, new yarnwrap.item.tooltip.TooltipType(tooltipType), lines);
    }
}