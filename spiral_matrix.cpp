#include <vector>
#include <iostream>
using namespace std;

class Solution {
    public:
        vector<int> spiralOrder(vector<vector<int> >& matrix) {
            vector<vector<int> > visited(matrix.size(), vector<int> (matrix.at(0).size(), 0));
            vector<int> answer;

            int jLen = matrix.at(0).size();
            int lLen = matrix.size();
            int kLen = 0;
            int j,k,l,m;

            for (int i = 0; i < matrix.size(); i++)
            {
                for (j = i; j < jLen; j++)
                {
                    cout << "j = " << j << " right ";
                    visited.at(i).at(j) = 1;
                    if ((j+1 < matrix.at(i).size()) && visited.at(i).at(j+1) == 1)
                    {
                        goto OUT;
                    }
                    answer.push_back(matrix.at(i).at(j));
                }
                cout << endl;
                jLen--;
                j--;

                for (l = i+1; l < lLen; l++)
                {
                    cout << "l = " << l << " down ";
                    visited.at(l).at(j) = 1;
                    if ((l+1 < matrix.size()) && visited.at(l+1).at(j) == 1)
                    {
                        goto OUT;
                    }
                    answer.push_back(matrix.at(l).at(j));
                }
                cout << endl;
                lLen--;
                l--;

                for (k = j-1; k >= kLen; k--)
                {   
                    cout << "k = " << k << " left ";
                    visited.at(l).at(k) = 1;
                    if ((k-1 > 0) && visited.at(l).at(k-1) == 1)
                    {
                        goto OUT;
                    }
                    answer.push_back(matrix.at(l).at(k));
                }
                cout << endl;
                kLen++;
                k++;

                for (m = l-1; m > i; m--)
                {   
                    cout << "m = " << m << " up ";
                    visited.at(m).at(k) = 1;
                    if ((m-1 > 0) && visited.at(m-1).at(k) == 1)
                    {
                        goto OUT;
                    }
                    answer.push_back(matrix.at(m).at(k));
                }
                m++;
                cout << endl;
            }
            
            OUT:return answer;
        }
        
        vector<int> newSpiralOrder(vector<vector<int> >& matrix)
        {
            vector<int> answer;
            int rightLength = matrix.at(0).size();
            int downLength = matrix.size();
            int leftLength = 0;
            int upLength = matrix.size() - (matrix.size() - 1);
            int turnCounter = 0;
            int i = 0;
            int j = 0;

            answer.push_back(matrix.at(i).at(j));

            if (matrix.size() == 1 && matrix.at(0).size() == 1) return answer;

            while(answer.size() < matrix.size() * matrix.at(0).size())
            {
                int direction = turnCounter % 4;
                switch (direction) {
                    case 0: 
                        j++;
                        // cout << "j is " << j << endl;
                        if (j == rightLength)
                        {
                            // cout << "going down" << endl;
                            turnCounter++;
                            rightLength--;
                            j--;
                            continue;
                        }
                        break;
                    case 1:
                        i++;
                        // cout << "i is " << i << endl;
                        if (i == downLength)
                        {
                            // cout << "going left" << endl;
                            turnCounter++;
                            downLength--;
                            i--;
                            continue;
                        }
                        break;
                    case 2:
                        j--;
                        // cout << "j is " << j << endl;
                        if (j == leftLength - 1)
                        {
                            // cout << "going up" << endl;
                            turnCounter++;
                            leftLength++;
                            j++;
                            continue;
                        }
                        break;
                    case 3: 
                        i--;
                        // cout << "i is " << i << endl;
                        if (i == upLength - 1)
                        {
                            // cout << "going right" << endl;
                            turnCounter++;
                            upLength++;
                            i++;
                            continue;
                        }
                        break;
                }
                answer.push_back(matrix.at(i).at(j));

            }

            return answer;
        }

    // private:
        // vector<int> getLast(vector<vector<int> >& matrix) 
        // {

        // }
};

int main()
{
    Solution problem;
    vector<vector<int> > answerMatrix;

    // vector<vector<<int>> matrix{{1,2,3},{4,5,6},{7,8,9}};
    vector<vector<int> > mat1 = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    vector<vector<int> > mat2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    vector<vector<int> > mat3 = {{1,2},{3,4},{5,6},{7,8}};
    vector<vector<int> > mat5 = {{1,2},{3,4}};
    vector<vector<int> > mat4 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
    vector<vector<int> > mat6 = {{1},{3}};
     
    vector<int> answer1 = problem.newSpiralOrder(mat1);
    vector<int> answer2 = problem.newSpiralOrder(mat2);
    vector<int> answer3 = problem.newSpiralOrder(mat3);
    vector<int> answer4 = problem.newSpiralOrder(mat4);
    vector<int> answer5 = problem.newSpiralOrder(mat5);
    vector<int> answer6 = problem.newSpiralOrder(mat6);

    answerMatrix.push_back(answer1);
    answerMatrix.push_back(answer2);
    answerMatrix.push_back(answer3);
    answerMatrix.push_back(answer4);
    answerMatrix.push_back(answer5);
    answerMatrix.push_back(answer6);




    for (int i = 0; i < answerMatrix.size(); i++)
    {
        for (int j = 0; j < answerMatrix.at(i).size(); j++)
        {
            cout << answerMatrix.at(i).at(j) << " ";
            if (j == answerMatrix.at(i).size() - 1)
            {
                cout << endl;
            }
        }
        
    }

    // for (int i = 0; i < answer.size(); i++)
    // {
    //     if (i == answer.size() -1)
    //     {
    //         cout << answer.at(i) << endl;
    //     }
    //     cout << answer.at(i) << " ";:1784
    
    // }

    
}