package main;

import java.nio.file.WatchEvent;

import entity.NPC_Inspector;
import entity.NPC_oldman;
import monster.Slime;
import monster.Tanuki;
import object.Axe;
import object.Boots;
import object.Chest;
import object.DStradeMark;
import object.Door;
import object.Key;
import object.SteelShield;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        int i = 0;

        gp.obj[i] = new Key(gp);
        gp.obj[i].worldX = gp.tileSize * 23;
        gp.obj[i].worldY = gp.tileSize * 20;
        i++;
        gp.obj[i] = new Key(gp);
        gp.obj[i].worldX = gp.tileSize * 21;
        gp.obj[i].worldY = gp.tileSize * 19;
        i++;
        gp.obj[i] = new Key(gp);
        gp.obj[i].worldX = gp.tileSize * 26;
        gp.obj[i].worldY = gp.tileSize * 21;
        i++;

        gp.obj[i] = new Axe(gp);
        gp.obj[i].worldX = gp.tileSize * 20;
        gp.obj[i].worldY = gp.tileSize * 18;
        i++;

        gp.obj[i] = new SteelShield(gp);
        gp.obj[i].worldX = gp.tileSize * 25;
        gp.obj[i].worldY = gp.tileSize * 24;

    }

    public void setNPC() {
        gp.npc[0] = new NPC_Inspector(gp);
        gp.npc[0].worldX = gp.tileSize * 10;
        gp.npc[0].worldY = gp.tileSize * 10;
        gp.npc[1] = new NPC_oldman(gp);
        gp.npc[1].worldX = gp.tileSize * 35;
        gp.npc[1].worldY = gp.tileSize * 10;
    }

    public void setMonster() {
        gp.monster[0] = new Slime(gp);
        gp.monster[0].worldX = gp.tileSize * 12;
        gp.monster[0].worldY = gp.tileSize * 10;

        gp.monster[1] = new Slime(gp);
        gp.monster[1].worldX = gp.tileSize * 20;
        gp.monster[1].worldY = gp.tileSize * 18;

        gp.monster[2] = new Tanuki(gp);
        gp.monster[2].worldX = gp.tileSize * 25;
        gp.monster[2].worldY = gp.tileSize * 20;

        gp.monster[3] = new Tanuki(gp);
        gp.monster[3].worldX = gp.tileSize * 30;
        gp.monster[3].worldY = gp.tileSize * 15;

    }
}
