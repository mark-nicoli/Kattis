num = int(input())
simonsays = "Simon says"
for _ in range(n):
    sim = input()
    if sim.startswith(simon_says):
        print(sim[len(simon_says):])
