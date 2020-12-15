def removeSlice(array, start, end):
    newArray = []
    for i in range(len(array)):
        if i < start or i > end:
            newArray.append(array[i])
    return newArray