function runProgram(input) {

    input = input.split("\n");
    var t = Number(input[0])
    var line = 1
    for(var i = 0; i < t; i++){
        var str = input[line].trim()
        line++
        let out = classical(str)
        console.log(out)
    }
  }
    function classical(str){
        // console.log("str",str)
        let stack = [];
        // console.log("Up_Stack",stack)
        for(let i = 0; i < str.length; i++){
            // console.log("Stack",stack)
            if(str[i] == "(" || str[i] == "{" || str[i] == "[" ){
                // console.log("str1111111", str[i])
                stack.push(str[i])
            } else {
                if(stack.length == 0){
                    return "not balanced"
                }
                let temp = stack.pop()
                switch (str[i]) {
                    case ")":
                        if(temp == "[" || str[i] == "{"){
                            return "not balanced"
                        }
                        break;
                    case "}":
                        if(temp == "[" || str[i] == "("){
                            return "not balanced"
                        }
                        break;

                    case "]":
                        if(temp == "(" || str[i] == "{"){
                            return "not balanced"
                        }
                        break;
                    default:
                        break;
                }
            }
        }
        if(stack.length != 0){
            return "not balanced" 
        }
        return "balanced"
    }



  if (process.env.USERNAME === 'ROHIT KUMAR') {
    runProgram(`3
    {([])}
    ()
    ([]
    `);
  } else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function () {
      read = read.replace(/\n$/, "");
      read = read.replace(/\n$/, "");
      runProgram(read);
    });
    process.on("SIGINT", function () {
      read = read.replace(/\n$/, "");
      runProgram(read);
      process.exit(0);
    });
  }