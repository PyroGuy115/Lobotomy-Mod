package com.pyro.lobotomymod.item.custom;

import com.pyro.lobotomymod.block.ModBlocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

public class CumItem extends Item {

    public CumItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();

        if (!world.isClient()) {
            world.setBlockState(context.getBlockPos(), ModBlocks.CUM_BLOCK.getDefaultState());

            context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()), item ->
                    context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND)
            );

            world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_MUD_PLACE, SoundCategory.BLOCKS);
        }

        return ActionResult.SUCCESS;
    }
}