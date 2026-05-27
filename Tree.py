s="axxxxyyyyb"
part = "xy"
while part in s:
    idx=s.find(part)
    print(idx)
    s=s.replace(s[idx:idx+len(part)],"")
    print(s)