from sys import exit

def start():
    print("你是进入酷安花粉群的新人，现在你想要拜谁为大哥，输入序号来选择吧！")
    print("1.管理员：我是大孩子")
    print("2.管理员：我是太上皇")
    print("3.带头大哥：机233刘金城")

    choice = input("> ")

    if choice == "1":
        a1()
    elif choice == "2":
        a1()
    elif choice == "3":
        b1()
    else:
        print("选择其他人的功能正在开发，敬请期待！")
        start()

def a1():
    print("你确定不选择带头大哥：刘金城吗？")
    print("Yes or No")

    choice = input("> ")

    if choice == "Yes":
        b2()
    elif choice == "No":
        b1()
    else:
        print("请输入Yes 或者 No")
        a1()

def b2():
    print("刘金城具有多项技能，你确认不选择吗？！")
    print("Yes or No")

    choice = input("> ")

    if choice == "Yes":
        c1()
    elif choice == "No":
        b1()
    else:
        print("请输入Yes 或者 No")
        b2()

def c1():
    print("由于你没有选择刘金城，你陷入了无限月读")
    print("无论输入什么都无济于事")
    print("Yes or No")

    choice = input("> ")

    if choice == "热浪真帅":
        d1()
    else:
        print("写轮眼.jpg")

def d1():
    print("没想到让你给蒙出来了")
    print("但是你还是被强制选择了刘金城")
    b1()

def b1():
    print("恭喜你选择了强力带头大哥刘金城。")
    print("现在你的任务是，打败群主群主！")
    print("消灭群主暴政，世界属于刘金城！")
    print("现在有以下武器可供选择，请输入序号进行选择。")
    print("1.格洛克：久经沙场的可靠手枪。")
    print("2.炽焰战斧：这玩意是冷兵器还是热兵器")
    print("3.不知名的手机状投掷物：由出身于芬兰的某公司制作")
    print("4.隐藏武器：可能会有特殊效果")
    choice = input("> ")

    if choice == "1":
        e1()
        
    if choice == "2":
        e1()
        
    if choice == "3":
        e1()
        
    if choice == "4":
        e2()
    else:
        print("请输入数字1-4")
        b1()

def e1():
    print("群主使用群主大权，对你和刘金城造成毁灭性打击。")
    print("卒！")
    exit(0)

def e2():
    print("隐藏物品居然是女装")
    print("群主穿上了女装，成为了大家星怒!")
    exit(0)

start()


