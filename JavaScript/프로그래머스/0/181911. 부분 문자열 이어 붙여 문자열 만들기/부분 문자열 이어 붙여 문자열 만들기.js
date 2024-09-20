function solution(my_strings, parts) {
    var answer = '';
    let num = 0;
    let num2 = 1;
    for(let i = 0; i < my_strings.length; i++) {
        answer += my_strings[i].substring(parts[i][num], parts[i][num2]+1);
    }
    return answer;
}