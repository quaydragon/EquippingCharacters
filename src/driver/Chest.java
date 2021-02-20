package driver;




import clothing.AbstractClothing;
import clothing.AttackOrDefense;
import clothing.FootWear;
import clothing.HandGear;
import clothing.HeadGear;
import clothing.Jewelry;
import clothing.Obsolescence;
import java.util.ArrayList;
import java.util.List;

/**
 * This chest class is filled with 4 head gear.
 * 8 foot wear items.
 * 15 hand gear items. 
 * 15 items of jewelry.
 * @author quaydragon
 *
 */
public class Chest {
  protected List<AbstractClothing> chest;
  // 4 head gear
  public HeadGear bucketHat;
  public HeadGear crown;
  public HeadGear helmet;
  public HeadGear thirdEye;
  // 8 foot wear
  public FootWear birkenstocks;
  public FootWear clogs;
  public FootWear cleats;
  public FootWear slippers;
  public FootWear combatBoots;
  public FootWear sandals;
  public FootWear runners;
  public FootWear paws;
  // 15 items of hand gear
  public HandGear classRing;
  public HandGear spikes;
  public HandGear nailPolish;
  public HandGear fingerGun;
  public HandGear lighter;
  public HandGear worldsTiniestViolin;
  public HandGear switchBlade;
  public HandGear fingerNails;
  public HandGear crowBar;
  public HandGear pen;
  public HandGear guitarPick;
  public HandGear ring;
  public HandGear cellPhone;
  public HandGear tattoo;
  public HandGear glove;
  // 15 items of jewelry
  public Jewelry goldChain;
  public Jewelry earings;
  public Jewelry amulet;
  public Jewelry bellyRing;
  public Jewelry silverChain;
  public Jewelry beadedNecklace;
  public Jewelry noseRing;
  public Jewelry eyebrowPiercing;
  public Jewelry ascot;
  public Jewelry hoops;
  public Jewelry laurelWreath;
  public Jewelry septumPiercing;
  public Jewelry liveStrongBand;
  public Jewelry bracelet;
  public Jewelry boloTie;
  
  
  /**
   * This class creates the chest for the game. 
   * There are 4 head gear options.
   * 8 foot wear options.
   * 15 hand gear options.
   * 15 jewelry items.
   */
  public Chest() {
    
    
    
    chest = new ArrayList<AbstractClothing>();
    
    
    // Head Gear
    
    bucketHat = new HeadGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.FAST,
        20,
        50,
        "Bucket hat of Hater Relief",
        1);
    
    crown = new HeadGear(AttackOrDefense.DEFENSE,
        true,
        Obsolescence.FAST,
        3,
        21,
        "Crown of Corruption",
        1);
    
    helmet = new HeadGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.FAST,
        20,
        75,
        "Helmet of Palpable Protection",
        1);
    
    thirdEye = new HeadGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        100,
        100,
        "Third Eye of Transcendence",
        1);
    
    // Foot Wear
    birkenstocks = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.MEDIUM,
        4,
        10,
        "BirkenStocks of Toxic Hippy Tears",
        1);
    clogs = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        10,
        95,
        "Clogs of The Power of Love",
        1);
    cleats = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        2,
        5,
        "Cleat of Spikey Stele",
        1);
    slippers = new FootWear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.FAST,
        5,
        2,
        "Slippers of Falling Death",
        1);
    combatBoots = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        70,
        80,
        "Combat Boots of B@d@$$ery",
        1);
    sandals = new FootWear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.FAST,
        20,
        10,
        "Sandals of Toe Burn",
        1);
    runners = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        40,
        40,
        "Sneakers of Flying",
        1);
    paws = new FootWear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.MEDIUM,
        4,
        10,
        "Paws of Cute Killer",
        1);
    
    //Hand Gear
    
    classRing = new HandGear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.NEVER,
        10,
        40,
        "Class Ring of Condenscension",
        1);
    glove = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        11,
        20,
        "Glove of Punch Power",
        1);
    tattoo = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        20,
        45,
        "Tattoo of B@d@$$ Behavior",
        1);
    fingerGun = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        4,
        23,
        "Finger Gun of Dad Energy",
        1);
    lighter = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.SLOW,
        4,
        35,
        "Lighter of Arson",
        1);
    pen = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.MEDIUM,
        8,
        1,
        "Pen of Fighting Words",
        1);
    guitarPick = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.FAST,
        4,
        23,
        "Guitar Pick of Musical Prowess",
        1);
    nailPolish = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.FAST,
        6,
        34,
        "Nail Polish of Poison",
        1);
    ring = new HandGear(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        5,
        5,
        "Ring of Bling a Ling",
        1);
    spikes = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        13,
        67,
        "Spikes of Death",
        1);
    cellPhone = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        4,
        8,
        "Cell Phone of Manipulation",
        1);
    worldsTiniestViolin = new HandGear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.MEDIUM,
        15,
        9,
        "Worlds Tiniest Violin of Saddness",
        1);
    switchBlade = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        10,
        23,
        "Switch Blade of Stabbing",
        1);
    fingerNails = new HandGear(AttackOrDefense.ATTACK,
        true,
        Obsolescence.FAST,
        1,
        4,
        "Finger Nails of Breaking",
        1);
    crowBar = new HandGear(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        10,
        49,
        "Crow Bar of Smack",
        1);
    
    
    // jewelry
    
    goldChain = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        21,
        50,
        "Gold Chain of Light Power",
        1);
    
    earings = new Jewelry(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        2,
        5,
        "Earings of Hearing Power",
        1);
    amulet = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        12,
        53,
        "Amulet of Body Control",
        1);
    bellyRing = new Jewelry(AttackOrDefense.DEFENSE,
        true,
        Obsolescence.NEVER,
        21,
        50,
        "Belly Ring of Bad Decisions",
        1);
    silverChain = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        20,
        50,
        "Silver Chain of Truth",
        1);
    beadedNecklace = new Jewelry(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.FAST,
        21,
        3,
        "Beads of Wisdom",
        1);
    
    noseRing = new Jewelry(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        13,
        21,
        "Nose Ring of Super Smell",
        1);
    eyebrowPiercing = new Jewelry(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        2,
        56,
        "Eye Brow Piercing of Angst",
        1);
    ascot = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        2,
        12,
        "Ascot of Better than You",
        1);

    hoops = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.SLOW,
        16,
        23,
        "Hoops of Ring Your Neck",
        1);
    
    laurelWreath = new Jewelry(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        25,
        34,
        "Laurel Wreath of Divine Power",
        1);
    septumPiercing = new Jewelry(AttackOrDefense.DEFENSE,
        false,
        Obsolescence.NEVER,
        23,
        23,
        "Septum Piercing of Smell Power",
        1);
    liveStrongBand = new Jewelry(AttackOrDefense.DEFENSE,
        true,
        Obsolescence.NEVER,
        34,
        56,
        "Live Strong Band of Cheating",
        1);
    bracelet = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        2,
        34,
        "Necklace of Light Power",
        1);
    boloTie = new Jewelry(AttackOrDefense.ATTACK,
        false,
        Obsolescence.NEVER,
        2,
        50,
        "Bolo Tie of Cowboy Power",
        1);
    
    System.out.print("FILLING THE CHEST");
    
    this.chest.add(bucketHat);
    this.chest.add(crown);
    this.chest.add(helmet);
    this.chest.add(thirdEye);
    this.chest.add(birkenstocks);
    this.chest.add(clogs);
    this.chest.add(cleats);
    this.chest.add(slippers);
    this.chest.add(combatBoots);
    this.chest.add(sandals);
    this.chest.add(runners);
    this.chest.add(paws);
    this.chest.add(classRing);
    this.chest.add(spikes);
    this.chest.add(nailPolish);
    this.chest.add(fingerGun);
    this.chest.add(lighter);
    this.chest.add(worldsTiniestViolin);
    this.chest.add(switchBlade);
    this.chest.add(fingerNails);
    this.chest.add(crowBar);
    this.chest.add(fingerNails);
    this.chest.add(pen);
    this.chest.add(guitarPick);
    this.chest.add(ring);
    this.chest.add(cellPhone);
    this.chest.add(tattoo);
    this.chest.add(glove);
    this.chest.add(goldChain);
    this.chest.add(earings);
    this.chest.add(bellyRing);
    this.chest.add(silverChain);
    this.chest.add(beadedNecklace);
    this.chest.add(noseRing);
    this.chest.add(eyebrowPiercing);
    this.chest.add(ascot);
    this.chest.add(hoops);
    this.chest.add(laurelWreath);
    this.chest.add(septumPiercing);
    this.chest.add(liveStrongBand);
    this.chest.add(bracelet);
    this.chest.add(boloTie);


    
  }
  
  /**
   * Returns the chest. 
   * @return the chest used for the game
   */
  public List<AbstractClothing> getChest() {
    System.out.print("Returning Chest");
    return this.chest;
  }
  

}
