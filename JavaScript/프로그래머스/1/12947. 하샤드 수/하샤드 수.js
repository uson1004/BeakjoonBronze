function solution(x) {
    var answer = true;
    
    var str = String(x)
    let str2 = 0
    for ( let i = 0; i < str.length; i++) {
        str2 += parseInt(str[i]);
    }
    if (str % str2 == 0) {
        return true
    } else {
        return false
    }
    return 
}